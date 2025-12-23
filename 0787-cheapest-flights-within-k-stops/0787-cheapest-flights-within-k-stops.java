import java.util.*;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // Step 1: Build adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < flights.length; i++) {
            int u = flights[i][0];
            int v = flights[i][1];
            int cost = flights[i][2];
            adj.get(u).add(new int[]{v, cost});
        }

        // Step 2: Cost array
        int[] minCost = new int[n];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[src] = 0;

        // Step 3: Queue -> {currentCity, totalCost, stopsUsed}
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0, 0});

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int city = data[0];
            int costSoFar = data[1];
            int stopsUsed = data[2];

            if (stopsUsed > k) continue;

            for (int[] edge : adj.get(city)) {
                int next = edge[0];
                int price = edge[1];

                int newCost = costSoFar + price;

                if (newCost < minCost[next]) {
                    minCost[next] = newCost;
                    queue.offer(new int[]{next, newCost, stopsUsed + 1});
                }
            }
        }

        return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
    }
}
