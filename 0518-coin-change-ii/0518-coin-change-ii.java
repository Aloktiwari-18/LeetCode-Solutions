class Solution {
   
    public int solve(int amount, int [] coins, int idx, int sum,int dp[][]){
        if(sum==amount){
            return 1;
        }
        if(idx==coins.length || sum>amount){
            return 0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
         }
            
           int  take= solve(amount, coins, idx, sum+coins[idx],  dp);
           int skip= solve(amount, coins, idx+1, sum, dp);
             
        
        return dp[idx][sum]= take+skip;
       
    }
    public int change(int amount, int[] coins) {
   
        int dp[][]= new int [coins.length][amount+1];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        return solve(amount, coins , 0, 0, dp);
        
    }
}