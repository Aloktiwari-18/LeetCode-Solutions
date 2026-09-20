import java.util.*;

class Solution {

    public int minimumOperations(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int ans = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            int[] arr = new int[size];

            // Current level values
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                arr[i] = node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            // Minimum swaps for current level
            ans += minSwaps(arr);
        }

        return ans;
    }

    public int minSwaps(int[] arr) {

        int n = arr.length;

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {

            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        boolean[] visited = new boolean[n];

        int swaps = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] || pairs[i][1] == i) {
                continue;
            }

            int cycleSize = 0;

            int j = i;

            while (!visited[j]) {

                visited[j] = true;

                j = pairs[j][1];

                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }
}