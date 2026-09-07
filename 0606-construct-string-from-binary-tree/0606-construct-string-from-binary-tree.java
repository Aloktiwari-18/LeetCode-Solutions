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
    StringBuilder sb= new StringBuilder();
    public void solve(TreeNode root){
        if(root==null){
            return;
        }
        
        sb.append(Integer.toString(root.val));
        if(root.left!=null || root.right!=null){
            sb.append("(");
            solve(root.left);
            sb.append(")");
            if(root.right!=null){
                sb.append("(");
                solve(root.right);
                sb.append(")");
            }
        }


    }
    public String tree2str(TreeNode root) {
        
        solve(root);
return sb.toString();

        
    }
}