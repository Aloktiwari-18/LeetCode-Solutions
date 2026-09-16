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
    
    public int count(TreeNode root){
        if(root==null){
            return 0;
        }
       
      return 1+  count(root.left) +
        count(root.right);
    }

    public boolean solve(TreeNode root, int idx, int tot){
        if(root==null){
            return true;
        }
        if(idx>tot){
            return false;
        }
        return solve(root.left, 2*idx, tot) && solve(root.right, 2*idx+1,tot);
    }
public boolean isCompleteTree(TreeNode root) {
       int idx=1;
       int tot=count(root);
      return solve(root, idx, tot);
    }
}