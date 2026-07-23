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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(q.size()>0){
            int size= q.size();
            List<Integer> list= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode num= q.poll();
                list.add(num.val);
                if(num.left!=null) q.add(num.left);
                if(num.right!=null) q.add(num.right);

                
                
            }
            ans.add(list.get(list.size()-1));
            
        }
        return ans;
        
    }
}