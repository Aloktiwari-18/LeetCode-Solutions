import java.util.*;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];
        for (int[] row : dist)
            Arrays.fill(row, Integer.MAX_VALUE);

        // {effort, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        dist[0][0] = 0;
        pq.offer(new int[]{0, 0, 0});

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int effort = cur[0];
            int r = cur[1];
            int c = cur[2];

            // destination reached
            if (r == n - 1 && c == m - 1)
                return effort;

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                    int newEffort = Math.max(
                        effort,
                        Math.abs(heights[r][c] - heights[nr][nc])
                    );

                    if (newEffort < dist[nr][nc]) {
                        dist[nr][nc] = newEffort;
                        pq.offer(new int[]{newEffort, nr, nc});
                    }
                }
            }
        }
        return 0;
    }
}
