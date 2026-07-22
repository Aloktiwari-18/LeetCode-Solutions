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
    int maxi;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left= helper(root.left);
        int right= helper(root.right);

        maxi= Math.max( maxi, root.val + Math.max(0,left) + Math.max(0, right));
        return root.val + Math.max(Math.max(0,left),Math.max(0, right));


    }
    public int maxPathSum(TreeNode root) {
        maxi= Integer.MIN_VALUE;
        helper(root);
        return maxi;
        
    }
}