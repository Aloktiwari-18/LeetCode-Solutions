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
        List<Double> wrapList= new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
         if(root==null) return null;

         q.add(root);
         while(!q.isEmpty()){
            int levelNum= q.size();
            
            double average=0;
            double num=0;
            for(int i=0;i<levelNum;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                num=num+q.poll().val;
                

                
                

            }
            average=num/levelNum;
            
            wrapList.add(average);

         }
         return wrapList;

        
    }
}