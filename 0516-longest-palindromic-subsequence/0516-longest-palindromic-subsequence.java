class Solution {
    // public int solve(int m, int n, StringBuilder sb1, StringBuilder sb2, int [] dp){
    //     if(m==0 || n==0){
    //         return 0;
    //     }
    //     if(sb1.charAt(i)==sb2.charAt())
    // }
   
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder s2= new StringBuilder(s);
        StringBuilder sb2= s2.reverse();
        int dp[][]= new int[sb1.length()+1][sb2.length()+1];
        
      for(int i=1;i<=sb1.length();i++){
        for(int j=1;j<=sb2.length();j++){
            if(sb1.charAt(i-1)==sb2.charAt(j-1)){
                dp[i][j]= dp[i-1][j-1]+1;
            }else{
                dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
      }
      return dp[sb1.length()][sb2.length()];
        

       

        
    }
}