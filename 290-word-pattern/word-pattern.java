class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false; // lengths must match
        }

        HashMap<Character, String> map1 = new HashMap<>(); // pattern -> word
        HashMap<String, Character> map2 = new HashMap<>(); // word -> pattern

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            // Check pattern -> word
            if (map1.containsKey(c)) {
                if (!map1.get(c).equals(word)) {
                    return false;
                }
            } else {
                map1.put(c, word);
            }

            // Check word -> pattern
            if (map2.containsKey(word)) {
                if (map2.get(word) != c) {
                    return false;
                }
            } else {
                map2.put(word, c);
            }
        }

        return true;
    }
}
