import java.util.*;

class Solution {

    static class Pair {
        int node;
        long dist;

        Pair(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public int countPaths(int n, int[][] roads) {

        int MOD = 1_000_000_007;

        // Graph: node -> {neighbor, time}
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] r : roads) {
            adj.get(r[0]).add(new int[]{r[1], r[2]});
            adj.get(r[1]).add(new int[]{r[0], r[2]});
        }

        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[0] = 0;

        int[] ways = new int[n];
        ways[0] = 1;

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> (int)(a.dist - b.dist));

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            long d = curr.dist;

            if (d > distance[u]) continue;

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                long wt = edge[1];

                long newDist = d + wt;

                if (newDist < distance[v]) {
                    distance[v] = newDist;
                    ways[v] = ways[u];
                    pq.add(new Pair(v, newDist));
                }
                else if (newDist == distance[v]) {
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }

        return ways[n - 1];
    }
}
