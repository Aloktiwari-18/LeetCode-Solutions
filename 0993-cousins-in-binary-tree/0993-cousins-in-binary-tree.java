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

    static class Pair {
        TreeNode node;
        TreeNode parent;

        Pair(TreeNode node, TreeNode parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, null));

        while (!q.isEmpty()) {
            int size = q.size();

            TreeNode parentX = null;
            TreeNode parentY = null;

            for (int i = 0; i < size; i++) {
                Pair curr = q.poll();
                TreeNode node = curr.node;

                if (node.val == x) parentX = curr.parent;
                if (node.val == y) parentY = curr.parent;

                if (node.left != null)
                    q.offer(new Pair(node.left, node));

                if (node.right != null)
                    q.offer(new Pair(node.right, node));
            }

            if (parentX != null && parentY != null) {
                return parentX != parentY;
            }

            
        }

        return false;
    }
}
