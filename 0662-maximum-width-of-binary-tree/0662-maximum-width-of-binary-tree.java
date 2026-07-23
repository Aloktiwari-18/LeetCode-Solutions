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

 class Pair{

    TreeNode node;
    int num;
    Pair(TreeNode node, int num){
        this.node= node;
        this.num= num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        if(root==null) return 0;
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        while(q.size()>0){
            int size=q.size();
            int f=0;
            int l=0;
            int min=q.peek().num;

            for(int i=0;i<size;i++){
                Pair nodes= q.poll();
                TreeNode node= nodes.node;
                int currId= nodes.num;


                if(i==0) f=currId;
                if(i==size-1) l=currId;
                if(node.left!=null) q.add(new Pair(node.left, 2*currId+1));
                if(node.right!=null) q.add(new Pair(node.right, 2*currId+2));
            }
            ans=Math.max(ans, l-f+1);

        }
         return ans;
        
    }
}