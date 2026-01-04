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
    
   

    public void preOrder(TreeNode root,ArrayList<Integer> arr){
    
        if(root==null) return;
        arr.add(root.val);
       preOrder(root.left,arr);
         
        preOrder(root.right,arr);
        
        

    }

    
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> arr= new ArrayList<>();
        preOrder(root,arr);
        long min=Long.MAX_VALUE;
        long smin=Long.MAX_VALUE;

        for(int val:arr){
            if(val<min){
                smin=min;
                min=val;
            }if(val > min && val < smin){
                smin=val;
            }
        }
       return (smin == Long.MAX_VALUE) ? -1 : (int) smin;
        

    }
}