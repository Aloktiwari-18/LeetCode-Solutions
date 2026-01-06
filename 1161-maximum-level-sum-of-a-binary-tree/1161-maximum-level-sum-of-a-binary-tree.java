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
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);
        int level=0,ans=0,max=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            level++;
            int sum=0;
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                sum=sum+node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }

            }
            if(sum>max){
                max=sum;
                ans=level;
            }

        }
        return ans;
        
    }
}