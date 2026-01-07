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

    long maxProduct = 0;
    long totalSum = 0;


    private long totalSum(TreeNode root) {
        if (root == null) return 0;
        return root.val + totalSum(root.left) + totalSum(root.right);
    }

    private long findMax(TreeNode root) {
        if (root == null) return 0;

        long left = findMax(root.left);
        long right = findMax(root.right);

        long s = root.val + left + right;

     
        maxProduct = Math.max(maxProduct, s* (totalSum - s));

        return s;
    }

    public int maxProduct(TreeNode root) {
        totalSum = totalSum(root);
        findMax(root);
        return (int)(maxProduct % (1e9+7));
    }
}
