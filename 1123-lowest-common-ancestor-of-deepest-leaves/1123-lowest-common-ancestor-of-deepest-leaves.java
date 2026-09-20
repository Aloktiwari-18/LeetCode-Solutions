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
    int maxD=0;
    public void findDepth(TreeNode root, int depth){
        if(root==null){
            return;
        }
        maxD=Math.max(maxD, depth);
        findDepth(root.left, depth+1);
        findDepth(root.right, depth+1);
    }
    public TreeNode solve(TreeNode root, TreeNode par, int depth){
        if(root==null){
            return null;
        }
        if(depth==maxD){
            return root;
        }
        TreeNode left= solve(root.left, root, depth+1);
        TreeNode right= solve(root.right, root, depth+1);

        if(left!=null && right!=null){
            return root;
        }
        return (left==null)? right: left;
        
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
      
       
        if(root==null){
            return null;
        }
          if(root.left==null && root.right==null){
            return root;
        }
         findDepth(root,0);
         
         return solve( root, null,0);
        
    }
}