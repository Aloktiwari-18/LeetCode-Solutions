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

    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        dfs(root,targetSum,new ArrayList<>(),ans);
        return ans;
        
    }

    private void dfs(TreeNode node, int sum, List<Integer> path, List<List<Integer>> ans){
        if(node==null){
            return ;
        }
        path.add(node.val);
        sum-=node.val;
        if(node.left==null && node.right==null && sum==0){
            ans.add(new ArrayList<>(path));

        }
        dfs(node.left,sum,path,ans);
        dfs(node.right,sum,path,ans);
        path.remove(path.size()-1);


    }
}