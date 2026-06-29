class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sAr = s.toCharArray();
        char[] tAr = t.toCharArray();

        Arrays.sort(sAr);
        Arrays.sort(tAr);

        return Arrays.equals(sAr, tAr);
    }
}
