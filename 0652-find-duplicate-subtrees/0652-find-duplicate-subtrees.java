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

    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return result;
    }

    private String dfs(TreeNode root) {
        if (root == null) return "#";

        String left = dfs(root.left);
        String right = dfs(root.right);

        String serial = root.val + "," + left + "," + right;

        map.put(serial, map.getOrDefault(serial, 0) + 1);

        // jab second time mile tab hi add karo
        if (map.get(serial) == 2) {
            result.add(root);
        }

        return serial;
    }
}
