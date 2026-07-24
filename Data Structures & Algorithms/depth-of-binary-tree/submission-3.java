/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        // iterative DFS pre-order
        int res = 0;
        record Pair(TreeNode node, int depth) {
        }

        Deque<Pair> stack = new ArrayDeque<>();
        stack.push(new Pair(root, 1));
        System.out.println(stack);

        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            TreeNode node = pair.node;
            if (node == null)
                continue;
            int pairDepth = pair.depth;
            res = Math.max(res, pairDepth);
            stack.push(new Pair(node.right, pairDepth + 1));
            stack.push(new Pair(node.left, pairDepth + 1));
        }
        return res;

    }
}
