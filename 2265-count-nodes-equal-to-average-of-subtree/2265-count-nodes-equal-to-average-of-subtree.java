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
    int ans=0;
    public void solve(TreeNode root, int []count, int []add){
        if(root==null){
            return ;
        }
        count[0]++;
        add[0]+=root.val;
        solve(root.left, count, add);
        
        solve(root.right, count, add);
    }
    public void check(TreeNode root){
        if(root==null){
            return ;
        }
        int count[]={0};
        int add[]= {0};
        solve(root, count, add);
        if(root.val== add[0]/count[0]){
            ans++;
        }
        check(root.left);
        check(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        check(root);
        return ans;
        
    }
}