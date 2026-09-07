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
    public void solve(TreeNode root1, TreeNode root2, List<Integer> ans){
        if(root1==null && root2==null){
            return;
        }
    
   if(root1!=null){
    ans.add(root1.val);
    solve(root1.left, null , ans);
    solve(root1.right, null, ans);
   }

   if(root2!=null){
    ans.add(root2.val);
    solve(null, root2.left , ans);
    solve(null, root2.right, ans);
   }

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans= new ArrayList<>();
        solve(root1, root2, ans);
        Collections.sort(ans);
        return ans;
        
    }
}