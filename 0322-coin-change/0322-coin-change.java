class Solution {
    public long minCoin(int i, int [] nums, int amount, int [][] dp){
        if (i== nums.length) {
            if(amount==0){
                return 0;
            }
            else return Integer.MAX_VALUE;
        }
        
        if(dp[i][amount]!=-1) return dp[i][amount];

        long skip= minCoin(i+1, nums, amount, dp);
        if(amount- nums[i]<0) return dp[i][amount]= (int)skip;
        long take=1+ minCoin(i, nums, amount-nums[i], dp);
        return dp[i][amount]=(int ) Math.min(take, skip);
        
    }
    public int coinChange(int[] coins, int amount) {
        int N= coins.length;
        int dp[][]= new int [N+1][amount+1];
       

        for(int i=0;i<N;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;

            }
        }
      int ans=(int) minCoin(0, coins, amount,dp);
      if(ans==Integer.MAX_VALUE) return -1;
      return ans;

    }
}