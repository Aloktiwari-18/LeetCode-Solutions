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
    private TreeNode first;// first violation
    private TreeNode prev;// last guy in the inorder
    private TreeNode middle;// adjacent of first violation
    private TreeNode last;//second violation 

    private void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        if(prev!=null && (root.val<prev.val)){
            // if this is a first violation, mark these two nodes as " first" and "middle"
            if(first==null){
                first=prev;
                middle=root;
                // if this is a second violation mark this node as last
            }else{
                last=root;
            }
        }

// mark this node as previous
prev=root;
inorder(root.right);


    }
    public void recoverTree(TreeNode root) {
        first=middle=last=null;
        prev= new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t= first.val;
            first.val=last.val;
            last.val=t;
        } else if(first !=null && middle!=null ){
            int t= first.val;
            first.val=middle.val;
            middle.val=t;

        }
        
    }
}