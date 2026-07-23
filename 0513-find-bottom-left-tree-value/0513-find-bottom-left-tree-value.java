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
    int ans;
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        List<List<Integer>> l= new ArrayList<>();
        while(q.size()>0){
                int size= q.size();
                List<Integer> list= new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode num= q.poll();
                    list.add(num.val);
                    if(num.left!=null) q.add(num.left);
                    if(num.right!=null) q.add(num.right);
                }
                ans= list.get(0);
                
        }
return ans;
        
        
    }
}