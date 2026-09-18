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
class Pair
{
    TreeNode node;
    int idx;
    Pair(TreeNode node, int idx){
        this.node= node;
        this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size=q.size();
            Pair curr= q.peek();
            int f= curr.idx;
            int s=0;
            for(int i=0;i<size;i++){
                Pair next= q.poll();
                TreeNode next1=next.node;
                s=next.idx;
                if(next1.left!=null){
                    q.add(new Pair(next1.left,2*s));
                }
                if(next1.right!=null){
                    q.add(new Pair(next1.right,2*s+1));
                }
            }
            max= Math.max(max, s-f+1);
        }
        return max;
        
    }
}