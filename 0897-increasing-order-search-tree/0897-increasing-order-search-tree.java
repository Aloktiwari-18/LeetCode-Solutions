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
    ArrayList<TreeNode> arr= new ArrayList<>();
    public void helper(TreeNode root){
        if(root==null){
            return ;
        }

        helper(root.left);
        arr.add(root);
        
        helper(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        TreeNode node= arr.get(0);
        TreeNode curr=node;

        curr.left=null;
        for (int i = 1; i < arr.size(); i++) {
        curr.right = arr.get(i);
        curr = curr.right;
        curr.left = null;
    }
    curr.right=null;
        return node;
        
        
        

        
    }
}