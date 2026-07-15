class Solution {
    public boolean isValid(String s) {
        List<String> open = List.of("(", "{", "[");
        List<String> closed = List.of(")", "}", "]");
        StringBuffer sb = new StringBuffer(s);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            String curr = sb.charAt(i) + "";
            String prev = (stack.isEmpty()) ? "" : stack.peek();
            if (open.contains(curr)) {
                stack.push(curr);
                System.out.println(curr);
            } else if (closed.contains(curr)) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (check(curr, prev))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    private static boolean check(String curr, String prev) {
        return (("{".equals(prev) && "}".equals(curr)) || ("[".equals(prev) && "]".equals(curr))
            || ("(".equals(prev) && ")".equals(curr)));
    }
}
