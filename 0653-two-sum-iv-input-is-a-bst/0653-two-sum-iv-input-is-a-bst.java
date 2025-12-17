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
    public static void helper(TreeNode root,ArrayList<Integer> arr){
       
        if( root==null) return  ;
        
        helper(root.left,arr);
        arr.add(root.val);
        helper (root.right,arr);
        
        
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr= new ArrayList<>();
        helper(root,arr);
        int left=0;
        int right= arr.size()-1;
        while(left<right){
            if(arr.get(left)+arr.get(right)==k){
                return true;

            }else if(arr.get(left)+arr.get(right)>k){
                right--;
            }else{
                left++;
            }
             
        }
       return false;
        
        
        
    }
}