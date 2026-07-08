class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int j = n - 1;
        char[] strArr = s.toCharArray();
        for (int i = 0; i < n;) {
            if (i >= j) {
                break;
            }
            while (!(alphaNum(strArr[i]) || i >= j)) {
                i++;
            }
            while (!(alphaNum(strArr[j]) || i >= j)) {
                j--;
            }
            if (Character.toLowerCase(strArr[i]) != Character.toLowerCase(strArr[j])) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}
