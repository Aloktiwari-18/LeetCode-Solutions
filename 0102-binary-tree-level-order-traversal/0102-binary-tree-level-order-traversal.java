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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root== null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> subAns= new ArrayList<>();
            // System.out.print(q.size());
            for(int i=0;i<size;i++){

                TreeNode root1= q.poll();
                if(root1.left!=null) q.offer(root1.left);
                if(root1.right!=null) q.offer(root1.right);

                subAns.add(root1.val);
                for(int j=0;j<subAns.size();j++){
                    System.out.print(subAns.get(j)+" ");
                }
                System.out.println();
            }
            ans.add(subAns);
        }
        
        return ans;
        
    }
}