class Solution {
    public int solve(int m, int n, StringBuilder sb1, StringBuilder sb2, int [][] dp){
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(sb1.charAt(m)==sb2.charAt(n)){
            return dp[m][n]= 1+ solve(m-1, n-1, sb1, sb2, dp);
        }else{
            return dp[m][n]= Math.max(solve(m-1, n, sb1, sb2, dp), solve(m, n-1, sb1, sb2, dp));
        }

    }
   
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder s2= new StringBuilder(s);
        
        StringBuilder sb2= s2.reverse();
        int m=sb1.length();
        int n= sb2.length();
        int dp[][]= new int[sb1.length()+1][sb2.length()+1];

        for(int []e: dp){
            Arrays.fill(e, -1);

        }
        return solve(m-1, n-1, sb1, sb2, dp);
        
      
      
        

       

        
    }
}