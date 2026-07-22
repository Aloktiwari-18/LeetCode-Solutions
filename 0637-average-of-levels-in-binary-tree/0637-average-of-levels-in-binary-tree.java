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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            double sum=0;
            int s= q.size();
            int n=0;
            for(int i=0;i<s;i++){
                    TreeNode root1= q.poll();
                    if(root1.left!=null) q.add(root1.left);
                    if(root1.right!=null) q.add(root1.right);
                    n++;
                    sum+=root1.val;

            }
            ans.add(sum/n);
        }
        return ans;
        
        
    }
}