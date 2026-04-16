class Solution {
    public int solve(int i, int buy, int cap, int[] prices, int[][][] dp) {
        if(i == prices.length || cap == 0) return 0;

        if(dp[i][buy][cap] != -1) return dp[i][buy][cap];

        int profit = 0;

        if(buy == 1) {
            profit = Math.max(
                -prices[i] + solve(i+1, 0, cap, prices, dp), // buy
                solve(i+1, 1, cap, prices, dp)              // skip
            );
        } else {
            profit = Math.max(
                prices[i] + solve(i+1, 1, cap-1, prices, dp), // sell
                solve(i+1, 0, cap, prices, dp)               // skip
            );
        }

        return dp[i][buy][cap] = profit;
    }

    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][k+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int l=0;l<=k;l++){
                    dp[i][j][l] = -1;
                }
            }
        }

        return solve(0, 1, k, prices, dp);
    }
}