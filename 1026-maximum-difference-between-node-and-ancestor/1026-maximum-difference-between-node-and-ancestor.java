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
    int maxDiff= Integer.MIN_VALUE;
    public void solve(TreeNode root, int min, int max){
            if(root==null){
                return;
            }
            min= Math.min(root.val, min);
            max=Math.max(root.val, max);

            if(root.left==null && root.right==null){
                maxDiff= Math.max(maxDiff, Math.abs(max-min));
            }
            solve(root.left, min, max);
            solve(root.right, min, max);
    }

    public int maxAncestorDiff(TreeNode root) {
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

         solve(root, min, max);
         return maxDiff;

        
    }
}