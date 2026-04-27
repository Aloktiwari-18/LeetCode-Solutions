class Solution {
    int m, n;
    boolean[][] visited;
    Map<Integer, int[][]> map = new HashMap<>();
    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        map.put(1, new int[][]{{0,1}, {0,-1}});
        map.put(2, new int[][]{{1,0}, {-1,0}});
        map.put(3, new int[][]{{0,-1}, {1,0}});
        map.put(4, new int[][]{{0,1}, {1,0}});
        map.put(5, new int[][]{{0,-1}, {-1,0}});
        map.put(6, new int[][]{{0,1}, {-1,0}});
        return dfs(grid, 0, 0);
    }
    public boolean dfs(int[][] grid, int x, int y) {
        if(x == m - 1 && y == n - 1) return true;
        visited[x][y] = true;
        for(int[] d : map.get(grid[x][y])) {
            int nx = x + d[0];
            int ny = y + d[1];
            if(nx < 0 || ny < 0 || nx >= m || ny >= n || visited[nx][ny])
                continue;
            for(int[] back : map.get(grid[nx][ny])) {
                if(nx + back[0] == x && ny + back[1] == y) {
                    if(dfs(grid, nx, ny)) return true;
                }
            }
        }
        return false;
    }
}