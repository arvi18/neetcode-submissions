class Pair {
    Integer left;
    Integer right;

    public Pair(Integer left, Integer right) {
        this.left = left;
        this.right = right;
    }
}

class MinStack {
    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        // stack -> [1 ,-1]
        int minVal = Math.min(val, (stack.isEmpty() ? val : stack.peek().right));
        stack.push(new Pair(val, minVal));
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek().left;
    }

    public int getMin() {
        return stack.peek().right;
    }
}