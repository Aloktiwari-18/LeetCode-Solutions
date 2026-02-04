class Solution {
    public boolean isPerfact(int n){
       int sqr=(int) Math.sqrt(n);
       return (sqr*sqr==n);
    }
    public int minSquare(int n, int [] dp) {
        if(isPerfact(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min=Integer.MAX_VALUE;    
        for(int i=1;i<=n/2;i++){
            int count= minSquare(i,dp)+minSquare(n-i,dp);
            min= Math.min(count ,min);
        }
        return dp[n]=min;     
    }
    public int numSquares(int n){
        int dp[]= new int [n+1];
        Arrays.fill(dp,-1);
        return minSquare(n, dp);
    }
}