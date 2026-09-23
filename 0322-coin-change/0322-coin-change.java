class Solution {
    
    public int solve(int idx,int [] coins, int amount, int [][]dp){
        if(amount==0){
            return 0;
        }
        if (idx >= coins.length || amount < 0) {
            return Integer.MAX_VALUE;
        }
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        
        int take=solve(idx,coins, amount-coins[idx], dp);
        if(take!=Integer.MAX_VALUE){
            take++;
        }
        int skip= solve(idx+1, coins,amount, dp);
        return dp[idx][amount]= Math.min(take, skip);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;

        }
       
        int dp[][]=new int[coins.length+1][amount+1];
        for(int [] e:dp){
            Arrays.fill(e,-1);
        }
        int ans=solve(0,coins, amount, dp);
        return ans==Integer.MAX_VALUE ? -1:ans;
         
          
        
    }
}