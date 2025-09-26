class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> pos=new HashMap<>();
        int st=0,currLen=0,start=0,i=0;
        int maxLen=Integer.MIN_VALUE;
        for(i=0;i<s.length();i++){
            if(!pos.containsKey(s.charAt(i))){
                pos.put(s.charAt(i),i);
            }else{
                if(pos.get(s.charAt(i))>=st){
                    currLen=i-st;
                    if(currLen>maxLen){
                        maxLen=currLen;
                        start=st;
                    }
                    st=pos.get(s.charAt(i))+1;
                }
                pos.put(s.charAt(i),i);
            }
        }
        if(maxLen<i-st){
            maxLen=i-st;
        }
        return maxLen;
    }
}