import java.util.*;

class Solution {
    public int findCenter(int[][] edges) {

        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] vis = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();

        q.add(edges[0][0]); 
        vis[edges[0][0]] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            if (adj.get(node).size() == n - 1) {
                return node;
            }

            for (int nei : adj.get(node)) {
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }
        return -1;
    }
}
