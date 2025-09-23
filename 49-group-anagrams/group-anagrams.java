class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(str);
        }
        List<List<String>> result=new ArrayList<>();
        for(String s:map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }
}