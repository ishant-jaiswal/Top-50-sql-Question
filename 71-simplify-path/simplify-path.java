class Solution {
    public String simplifyPath(String path) {
        Deque<String> st=new ArrayDeque<>();
        String[] str=path.split("/");
        for(String word:str){
            if(word.equals("") || word.equals(".")){
                continue;
            }
            else if(word.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(word);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String s:st){
            result.insert(0,"/"+s);
        }
        return result.length()==0? "/" : result.toString();
    }
}