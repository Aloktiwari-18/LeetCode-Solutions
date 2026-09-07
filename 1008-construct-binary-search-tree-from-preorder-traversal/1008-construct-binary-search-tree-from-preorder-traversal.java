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
    int i=0;
    public TreeNode solve(int []P, int bound){
        if(i==P.length || P[i]>bound){
            return null;
        }
        TreeNode root= new TreeNode(P[i++]);
        root.left= solve(P, root.val);
        root.right= solve(P, bound);
        return root;
    }
    public TreeNode bstFromPreorder(int[] P) {
        return solve(P, Integer.MAX_VALUE);


        
    }
}