class Solution {
    public boolean canJump(int[] nums) {
         int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false; // can't even reach this position
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                return true; // can reach or pass last index
            }
        }

        return true;
    }
}