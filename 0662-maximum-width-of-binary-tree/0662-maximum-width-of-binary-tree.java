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
    public Pair(TreeNode _node,int _num){
        node=_node;
        num=_num;
    }
 }

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<Pair> qu= new LinkedList<>();
        qu.offer(new Pair(root,0));
        while(!qu.isEmpty()){
            int size=qu.size();
            int mmin=qu.peek().num;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
                int cur_id= qu.peek().num-mmin;
                TreeNode node=qu.peek().node;
                qu.poll();
                if(i==0) first=cur_id;
                if(i==size-1) last=cur_id;

                if(node.left!=null) qu.offer(new Pair(node.left,cur_id*2+1)); 
                if(node.right!=null) qu.offer(new Pair(node.right,cur_id*2+2));
            }
            ans=Math.max(ans,last-first+1);

        }
        return ans;
         
      
        
    }
}