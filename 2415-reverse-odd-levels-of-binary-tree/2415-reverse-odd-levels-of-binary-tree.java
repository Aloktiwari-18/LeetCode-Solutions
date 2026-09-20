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
    public void solve(TreeNode left1, TreeNode right1,int level){
        if(left1==null && right1==null){
            return ;
        }

        if(level%2==1){
            int temp=left1.val;
            left1.val=right1.val;
            right1.val= temp;
        }

        solve(left1.left, right1.right, level+1);
        solve(left1.right, right1.left, level+1);

    }
    public TreeNode reverseOddLevels(TreeNode root) {
        solve(root.left, root.right, 1);
        return root;
        
        
    }
}
