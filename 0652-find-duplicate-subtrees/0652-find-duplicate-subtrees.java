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
    List<TreeNode> ans= new ArrayList<>();
    HashMap<String , Integer> map= new HashMap<>();
    public String solve(TreeNode root){
         if(root==null){
            return "#";
        }
        String left= solve(root.left);
        String right=solve(root.right);

        String serial= root.val+ ","+ left+ "," +right;
         map.put(serial, map.getOrDefault(serial, 0)+1);

         if(map.get(serial)==2){
            ans.add(root);

         }
         return serial;

    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        solve(root);
        return ans;

        
    }
}