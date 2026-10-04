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
    int row;
    int col;
    Pair(TreeNode n,int r, int c ){
        node= n;
        row=r;
        col=c;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map= new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0,0));
        while(!q.isEmpty()){
            Pair tup= q.poll();
            TreeNode n= tup.node;
            int r=tup.row;
            int c= tup.col;

            if(!map.containsKey(r)){
                map.put(r, new TreeMap<>());

            }
            if(!map.get(r).containsKey(c)){
                map.get(r).put(c, new PriorityQueue<>());
            }
            map.get(r).get(c).add(n.val);
            if(n.left!=null){
                q.add(new Pair(n.left,r-1,c+1));
            }
            if(n.right!=null){
                q.add(new Pair(n.right, r+1,c+1));
            }
        }
        List<List<Integer>> list= new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> y: map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:y.values()){
                while(!nodes.isEmpty()){
                        list.get(list.size()-1).add(nodes.poll());
                }
                
            }
        }
        return list;
        
    }
}