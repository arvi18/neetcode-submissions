class Solution {
    public boolean isPalindrome(String s) {
        String s1 =
            s.toLowerCase()
                .chars()
                .filter(
                    x -> ((x >= 48 && x <= 57) || (x >= 65 && x <= 90) || (x >= 97 && x <= 122)))
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining());
        StringBuilder sb = new StringBuilder(s1);
        sb = sb.reverse();
        return s1.equals(sb.toString());
    }
}
