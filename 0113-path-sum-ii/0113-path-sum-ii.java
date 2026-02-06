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
    public void findPath(TreeNode root,int sum,List<Integer> path, List<List<Integer>> ans){
        if(root==null){
            return ;
        }
        sum-=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && sum==0){
            ans.add(new ArrayList<>(path));
        }
        findPath(root.left, sum, path, ans);
        findPath(root.right, sum, path, ans);
        // Backtracking
        path.remove(path.size()-1);
        return;



    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        
        findPath(root, targetSum, new ArrayList<>(), ans);
        return ans;
        
    }
}