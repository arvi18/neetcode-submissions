public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramsList = new ArrayList<>();

        Map<String, List<String>> charRepToWordMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] wordLetters = strs[i].toCharArray();
            int[] wordRep = new int[26];
            for (int j = 0; j < wordLetters.length; j++) {
                wordRep[wordLetters[j] - 'a'] += 1;
            }
            String key = Arrays.toString(wordRep);
            List<String> existingWords = charRepToWordMap.getOrDefault(key, new ArrayList<>());
            existingWords.add(strs[i]);
            charRepToWordMap.put(key, existingWords);
        }
        anagramsList.addAll(charRepToWordMap.values());
        return anagramsList;
    }
}