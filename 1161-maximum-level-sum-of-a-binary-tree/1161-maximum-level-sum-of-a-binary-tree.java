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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int max= Integer.MIN_VALUE;
        int ans=0;
        int level=0;
        while(!q.isEmpty()){
            int size= q.size();
            int sum=0;
            ans++;
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(sum>max){
                    max=Math.max(max, sum);
                    level=ans;
            }

            
        }
        return level;
        
    }
}