class Solution {
        public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> validOp = List.of("+", "-", "*", "/");
        for (String str: tokens) {
            if (isInt(str)) {
                stack.push(Integer.parseInt(str));
            } else if (validOp.contains(str)) {
                int second = stack.pop();
                int first = stack.pop();
                if ("+".equals(str)) stack.push(first + second);
                if ("-".equals(str)) stack.push(first - second);
                if ("*".equals(str)) stack.push(first * second);
                if ("/".equals(str)) stack.push(first / second);
            }
            
        }
        return stack.pop();
    }

    public boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException ig) {} 
        return false;
    }
}
