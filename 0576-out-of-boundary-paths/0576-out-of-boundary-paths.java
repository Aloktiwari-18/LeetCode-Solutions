class Solution {
    
    int mod=1000000007;
    public int  solve(int m, int n, int maxMove, int sRow, int sCol, Integer [][][] dp){
            if(sRow<0 || sCol<0  ||  sRow>=m || sCol>=n){
              return 1;
            }
            if(maxMove==0){
                return 0;

            }
            if(dp[sRow][sCol][maxMove]!=null){
                
                return dp[sRow][sCol][maxMove];
            }
            long d= (long) solve(m, n, maxMove-1, sRow+1, sCol, dp);
             long u= (long) solve(m, n, maxMove-1, sRow-1, sCol, dp);
              long l= (long) solve(m, n, maxMove-1, sRow, sCol-1, dp);
               long r= (long) solve(m, n, maxMove-1, sRow, sCol+1, dp);

               return dp[sRow][sCol][maxMove]=(int) ((l+d+u+r)%mod);
    }
    public int findPaths(int m, int n, int maxMove, int sRow, int sCol) {
        
        Integer [][][] dp= new Integer[m+1][n+1][maxMove+1];
          return solve (m, n, maxMove, sRow, sCol, dp) % mod;
        
        
        
    }
}