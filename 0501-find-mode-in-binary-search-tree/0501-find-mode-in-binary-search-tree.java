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
    Integer  prev=null;
    int maxCount=0;
    int count=0;
    ArrayList<Integer> ans = new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root==null) return ;
        inOrder(root.left);
        if(prev==null || root.val!=prev){
            count=1;
        }else{
            count++;
        }
        if(count>maxCount){
            maxCount=count;
            ans.clear();
            ans.add(root.val);

        }else if(count==maxCount){
            ans.add(root.val);
        }
        prev=root.val;
        inOrder(root.right);


    }
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int res[]= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]= ans.get(i);

        }
        return res;


        
    }
}