class Solution {
    public static int changeNum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = changeNum(n);
        }
        
        return n == 1;
    }
}