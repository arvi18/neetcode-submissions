class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char currChar : s.toCharArray()) {
            if (currChar == '(')
                stack.push(')');
            else if (currChar == '[')
                stack.push(']');
            else if (currChar == '{')
                stack.push('}');
            else {
                if (!stack.isEmpty() && currChar == stack.pop())
                    continue;
                else
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}
