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
    int max= Integer.MIN_VALUE;
    public void findMax(TreeNode root, TreeNode child){
        if(child==null){
            return ;
        }
        max=Math.max(max, Math.abs(root.val - child.val));
        findMax(root, child.left);
        findMax(root, child.right);
    }
    public void maxDiff(TreeNode root){
        if(root==null){
            return ;
        }
        findMax(root, root.left);
        findMax(root, root.right);

        maxDiff(root.left);
        maxDiff(root.right);
    }
    public int maxAncestorDiff(TreeNode root) {
         maxDiff(root);
         return max;
        
    }
}