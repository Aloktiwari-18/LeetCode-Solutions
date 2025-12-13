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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st= new Stack<TreeNode>();
        List <Integer> inOrder= new ArrayList<>();
    if (root==null) return inOrder;
    TreeNode node=root;
    while(node != null || !st.isEmpty()){
        if(node!=null){
            st.push(node);
            node=node.left;
        }else{
            node=st.pop();
            inOrder.add(node.val);
            node=node.right;
        }


    }
    return inOrder;
        
    }
}