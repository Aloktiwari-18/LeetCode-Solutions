class Solution {
    public int helper(int n, int dp[]){
        if(n==1) return 0;

        if(dp[n]!=Integer.MIN_VALUE){
            return dp[n];
        }
        int ans=Integer.MAX_VALUE;
        for(int a=1;a<n;a++){
            int b= n-a;
            ans= Math.min(ans, a*b +helper(a, dp)+helper(b,dp));

        }
        return dp[n]=ans;
    }
    public int minCost(int n) {
        int dp[]= new int[n+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        return helper(n, dp);
        
    }
}