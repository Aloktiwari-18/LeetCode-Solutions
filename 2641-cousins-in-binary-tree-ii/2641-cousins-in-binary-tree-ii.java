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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        ArrayList<Integer> arr= new ArrayList<>();
        while(!q.isEmpty()){
            int size=  q.size();
            int levelSum= 0;
            for(int i= 0;i<size; i++){
                TreeNode curr= q.poll();
                levelSum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }


            }
            arr.add(levelSum);
        }
        q.add(root);
        root.val=0;
        int level=1;
        while(!q.isEmpty()){
            int size= q.size();
            
            for(int i=0;i< size;i++){
                TreeNode curr= q.poll();
                int sibling= curr.left!=null ? curr.left.val:0;
                sibling+=curr.right!=null ? curr.right.val:0;

                if(curr.left!=null){
                    curr.left.val= arr.get(level)- sibling;
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    curr.right.val= arr.get(level)-sibling;
                    q.add(curr.right);
                }
            }
            level++;
        }
        return root;
        
    }
}