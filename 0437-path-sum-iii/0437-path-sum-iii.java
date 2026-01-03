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
    long total=0;
    
    private void findPath(TreeNode root, long currSum, int targetSum,HashMap<Long,Integer> hm){
        
        if(root==null) return;
        currSum+=root.val;
        
        if(hm.containsKey(currSum-targetSum)){
            total+=hm.get(currSum-targetSum);
        }
        hm.put(currSum, hm.getOrDefault(currSum,0)+1);

        findPath(root.left, currSum, targetSum,hm);
        findPath(root.right, currSum, targetSum,hm);
        
        hm.put(currSum, hm.get(currSum)-1);
        return ;

    }
    
    public int pathSum(TreeNode root, int targetSum) {
        total=0;

        if(root==null) return 0;

        HashMap<Long,Integer> hm= new HashMap<>();
        hm.put(0L,1);
        findPath( root, 0, targetSum ,hm);
        return (int)total;

    
       

        
        
        
    }
}