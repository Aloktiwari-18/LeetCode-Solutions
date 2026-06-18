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
        ArrayList<Integer> ans= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return new ArrayList<>();
        }
        q.add(root);
        
        while(q.size()!=0){
            int sz=q.size();
            
            ArrayList<Integer> currList= new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode curr = q.peek();
                currList.add(q.poll().val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }
            System.out.print(currList);
            ans.add(currList.get(currList.size() - 1));
            
            

        }
        return ans;
        
    }
}