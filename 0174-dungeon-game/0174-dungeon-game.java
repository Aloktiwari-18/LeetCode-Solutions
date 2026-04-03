class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        Integer[][] dp = new Integer[m][n];

        return helper(0, 0, dungeon, dp);
    }

    private int helper(int i, int j, int[][] dungeon, Integer[][] dp) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        if (i == m - 1 && j == n - 1) {
            return Math.max(1, 1 - dungeon[i][j]);
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int right = helper(i, j + 1, dungeon, dp);
        int down = helper(i + 1, j, dungeon, dp);

        int minHealth = Math.min(right, down);

        int ans = Math.max(1, minHealth - dungeon[i][j]);

        return dp[i][j] = ans;
    }
}