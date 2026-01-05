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
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        root.val = 0; 

        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;

            List<TreeNode> parents = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                parents.add(curr);

                if (curr.left != null) levelSum += curr.left.val;
                if (curr.right != null) levelSum += curr.right.val;
            }

            
            for (TreeNode parent : parents) {
                int siblingSum = 0;
                if (parent.left != null) siblingSum += parent.left.val;
                if (parent.right != null) siblingSum += parent.right.val;

                if (parent.left != null) {
                    parent.left.val = levelSum - siblingSum;
                    q.offer(parent.left);
                }
                if (parent.right != null) {
                    parent.right.val = levelSum - siblingSum;
                    q.offer(parent.right);
                }
            }
        }
        return root;
    }
}
