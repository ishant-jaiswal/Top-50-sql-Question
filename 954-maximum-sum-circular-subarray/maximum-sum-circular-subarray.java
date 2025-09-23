class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int curMax = 0;
        int minSum = nums[0];
        int curMin = 0;

        for (int num : nums) {
            // Kadane for max subarray
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            // Kadane for min subarray
            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);

            totalSum += num;
        }

        // Case: all numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Max of normal vs circular case
        return Math.max(maxSum, totalSum - minSum);

    }
}