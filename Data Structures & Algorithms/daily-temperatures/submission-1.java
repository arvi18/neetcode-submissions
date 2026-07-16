class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Pair> stack = new Stack<Pair>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek().val) {
                Pair poppedPair = stack.pop();
                result[poppedPair.index] = (i - poppedPair.index);
            }

            stack.push(new Pair(temperatures[i], i));
        }
        return result;
    }

    class Pair {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
}