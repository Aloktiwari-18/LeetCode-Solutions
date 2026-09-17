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

    public void solve2(TreeNode root,ArrayList<Integer> lst2){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            lst2.add(root.val);
        }
        solve2(root.left, lst2);
        solve2(root.right, lst2);
       

    }
    public void solve1(TreeNode root,ArrayList<Integer> lst1){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            lst1.add(root.val);
        }
        solve1(root.left, lst1);
        solve1(root.right, lst1);
       

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> lst1= new ArrayList<>();
        ArrayList<Integer> lst2= new ArrayList<>();

        solve1(root1, lst1);
        solve2(root2, lst2);
        return lst1.equals(lst2);

        
    }
}