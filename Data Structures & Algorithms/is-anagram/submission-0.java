class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2) return false;        
        
        return cStoMap(s).equals(cStoMap(t));
    }

    public Map<Character, Integer> cStoMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = map.getOrDefault(c, 1);
            if (map.containsKey(c)){
                count+=1;
            }
            map.put(c, count);
        }
        return map;
    }
}
