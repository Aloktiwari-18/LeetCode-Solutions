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
    public int pathSum(TreeNode root, int targetSum){
        if(root==null){
            return 0;
        }
        int[] c = {0};
        countPath(root, targetSum,c);
        c[0]+=pathSum(root.left, targetSum);
        c[0]+=pathSum(root.right, targetSum);
        return c[0];
    }
    public void countPath(TreeNode root, long targetSum, int[] c) {
        if(root==null) return;
        targetSum-=root.val;
        if(targetSum==0) c[0]++;
        countPath(root.left, targetSum,c);
        countPath(root.right,targetSum,c);
    }
}