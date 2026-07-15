class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

class MinStack {
    ArrayDeque<Pair> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
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