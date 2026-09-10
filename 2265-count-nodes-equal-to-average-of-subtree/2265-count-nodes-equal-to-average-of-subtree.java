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
    public  void solve(TreeNode root, int add[], int cnt[]){
        if(root==null){
            return ;
        }
        cnt[0]++;
        add[0]+=root.val;
        solve(root.left, add, cnt);
        solve(root.right,add,cnt);
    }
    public  void check(TreeNode root){
        if(root==null){
            return ;
        }
        int add[]={0};
        int cnt[]={0};
        solve(root, add, cnt);
        if(root.val==add[0]/cnt[0]){
            count++;
        }
        check(root.left);
        check(root.right);

    }
    public int averageOfSubtree(TreeNode root) {
        check(root);
        return count;
        
    }
}