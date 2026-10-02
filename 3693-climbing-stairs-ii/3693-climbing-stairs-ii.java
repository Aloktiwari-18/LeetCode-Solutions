class Solution {
    public int solve(int idx, int n, int[] costs, int[] dp) {
        if (idx == n) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }

        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        int t = Integer.MAX_VALUE;
        if (idx + 1 <= n) {
            f = costs[idx]
                    + 1
                    + solve(idx + 1, n, costs, dp);
        }
        if (idx + 2 <= n) {
            s = costs[idx + 1]
                    + 4
                    + solve(idx + 2, n, costs, dp);
        }    
        if (idx +3 <= n) {
            t = costs[idx + 2]
                    + 9
                    + solve(idx + 3, n, costs, dp);
        }
        return dp[idx] = Math.min(f, Math.min(s, t));
    }

    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(0, n, costs, dp);
    }
}