class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Row prefix sum
        int[][] row = new int[m][n + 1];
        // Column prefix sum
        int[][] col = new int[m + 1][n];
        // Main diagonal
        int[][] diag1 = new int[m + 1][n + 1];
        // Anti diagonal
        int[][] diag2 = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
                diag1[i + 1][j + 1] = diag1[i][j] + grid[i][j];
                diag2[i + 1][j] = diag2[i][j + 1] + grid[i][j];
            }
        }

        for (int size = Math.min(m, n); size >= 2; size--) {
            for (int i = 0; i + size <= m; i++) {
                for (int j = 0; j + size <= n; j++) {
                    if (isMagic(grid, row, col, diag1, diag2, i, j, size)) {
                        return size;
                    }
                }
            }
        }
        return 1;
    }

    private boolean isMagic(int[][] grid, int[][] row, int[][] col,
                            int[][] d1, int[][] d2, int r, int c, int k) {

        int target = row[r][c + k] - row[r][c];

        // Check rows
        for (int i = r; i < r + k; i++) {
            if (row[i][c + k] - row[i][c] != target) return false;
        }

        // Check columns
        for (int j = c; j < c + k; j++) {
            if (col[r + k][j] - col[r][j] != target) return false;
        }

        // Check diagonals
        if (d1[r + k][c + k] - d1[r][c] != target) return false;
        if (d2[r + k][c] - d2[r][c + k] != target) return false;

        return true;
    }
}
