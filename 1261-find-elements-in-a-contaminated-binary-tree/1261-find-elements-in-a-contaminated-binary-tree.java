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
class FindElements {
        HashSet<Integer> st= new HashSet<>();
    public TreeNode solve(TreeNode root, int val){
        if(root==null){
            return null;
        }
        root.val=val;
        st.add(val);
      root.left=  solve(root.left, 2*val+1);
      root.right=  solve(root.right, 2*val+2);
        return root;
    }

    public FindElements(TreeNode root) {
       
        solve(root, 0);

        
    }
    
    public boolean find(int target) {
        return st.contains(target);
        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */