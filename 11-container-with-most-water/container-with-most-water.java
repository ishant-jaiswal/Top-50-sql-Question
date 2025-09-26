class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int i=0,j=n-1;
        int area=Integer.MIN_VALUE;
        while(i<j){
            int currH=Math.min(height[i],height[j]);
            area=Math.max(area,(j-i)*currH);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return area;
    }
}