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
    
    public int solve(TreeNode curr, TreeNode par, TreeNode gradPar){
        int sum=0;
        if(curr==null){
            return 0;
        }
        if(gradPar!=null && gradPar.val%2==0){
            sum+=curr.val;
        }
       sum+= solve(curr.left, curr, par);
       sum+= solve(curr.right, curr, par);
       return sum;
        
    }
    public int sumEvenGrandparent(TreeNode root) {
        return solve(root, null, null);
    }
}