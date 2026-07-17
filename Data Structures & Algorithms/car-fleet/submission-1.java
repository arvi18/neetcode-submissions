class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        List<Pair> posi = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            posi.add(new Pair(position[i], speed[i]));
        }
        Collections.sort(posi, Comparator.comparing(x -> - x.left));
        for (int i = 0; i < posi.size(); i++) {
            double currTime = (double) (target - posi.get(i).left) / posi.get(i).right;
            stack.push(currTime);
            if (stack.size() >= 2 && currTime <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }

        return stack.size();
    }

    class Pair {
        int left;
        int right;

        public Pair(int val, int index) {
            this.left = val;
            this.right = index;
        }
    }
}
