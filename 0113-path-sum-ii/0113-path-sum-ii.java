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
    public void solve(TreeNode root, int target, List<List<Integer>> ans, List<Integer> sub){
        if(root==null){
            return;

        }
        sub.add(root.val);

        target-=root.val;

        if(root.left==null && root.right==null && target==0){
                ans.add(new ArrayList<>(sub));
                
                
        }
        solve(root.left, target, ans, sub);
        solve(root.right,target , ans, sub);
        sub.remove(sub.size()-1);


    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();

        
        solve(root, targetSum, ans,new ArrayList<>());
        return ans;
        
    }
}