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
    static int maxSum;
    public int calculate(TreeNode  root){
        if(root==null){
            return 0;
        }
        int left= calculate(root.left);
        int right= calculate(root.right);
        int pathSum= root.val;
        if(left>0) pathSum+=left;
        if(right>0) pathSum+=right;
        maxSum=Math.max(maxSum, pathSum);
        return root.val+ Math.max(0, Math.max(left, right));

    }
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        calculate(root);
        return maxSum;

        
    }
}