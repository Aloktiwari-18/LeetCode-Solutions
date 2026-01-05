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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode > q= new LinkedList<>();
        q.offer(root);
        List<Integer> ans= new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> subList= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node= q.poll();
                subList.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<subList.size();i++){
                if(subList.get(i)>max){
                    max=subList.get(i);
                }

            }
            ans.add(max);
        }
        return ans;
    }
}