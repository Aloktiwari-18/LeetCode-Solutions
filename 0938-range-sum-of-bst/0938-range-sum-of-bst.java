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
    ArrayList<Integer> arr= new ArrayList<>();
    public void helper(TreeNode root){
        if(root==null) {
            return;
            } 
        helper(root.left);
        arr.add(root.val);
        helper(root.right);

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root);
        int sum= 0;

        for(int i=0;i<arr.size();i++){
            int value=arr.get(i);
            if(value>=low && value<=high){
                sum=sum+value;
            }
        }
        return sum;
        
    }
}