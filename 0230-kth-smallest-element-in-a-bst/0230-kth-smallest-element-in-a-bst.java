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
    int count=0;
    int ans=0;
    public void calculate(TreeNode root, int k){
        if(root==null){
            return;
        }

        calculate(root.left, k);
        count=count+1;
        if(count==k){
            ans= root.val;
        }
        calculate(root.right, k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        calculate(root, k);
        return ans;
        
        
    }
}