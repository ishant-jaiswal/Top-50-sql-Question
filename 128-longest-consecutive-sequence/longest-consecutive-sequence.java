class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int currNum=num;
                while(set.contains(currNum+1)){
                    count++;
                    currNum++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}