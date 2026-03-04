class Solution {
    public int count(int i, int j, String s, int [][] dp){
        int n= s.length();
        
        if(i>=j) return 1;
        
        if(dp[i][j]!=-1){
            return dp[i][j];

        } 

        if(s.charAt(i)==s.charAt(j)){
             dp[i][j]= count(i+1, j-1, s, dp);

        }else{
        dp[i][j]= 0;
        }
        return dp[i][j];

        

    }
    public int countSubstrings(String s) {
        int n= s.length();
        int dp[][]= new int [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]= -1;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(count(i,j,s,dp)==1){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}