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
    int sum;
    public void helper(TreeNode root){
        sum+=root.val;
    }
    public boolean checkTree(TreeNode root) {

    if(root==null) return false;
        
       helper(root.left);
       helper(root.right);

       if(root.val==sum){
        return true;
    }
       else{
        return false;
       }
    }
}