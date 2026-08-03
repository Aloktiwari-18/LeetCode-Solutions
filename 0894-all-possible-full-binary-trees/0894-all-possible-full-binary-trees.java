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
    Map<Integer, List<TreeNode>> memo= new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans= new ArrayList<>();
        if(memo.containsKey(n)){
            return memo.get(n);

        }
        if(n==1){
            TreeNode root= new TreeNode(0);
            ans.add(root);
            return ans;

        }
        if(n==2){
            return ans;
        }
        
        for(int left=1;left<n;left+=2){
            int right= n-left-1;

            List<TreeNode> lft=allPossibleFBT(left);
            List<TreeNode> rht=allPossibleFBT(right);

            for(TreeNode l:lft){
                for(TreeNode r:rht){

                    TreeNode root= new TreeNode(0);
                    root.left=l;
                    root.right=r;
                    ans.add(root);
                }
            }
        }
        memo.put(n,ans);
        return ans;
         
    }
}