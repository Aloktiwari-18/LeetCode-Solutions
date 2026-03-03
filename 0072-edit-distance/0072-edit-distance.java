class Solution {
    
    public int findDist(int i, int j, String w1, String w2, int [][] dp){
        if(i==-1) return j+1;
        if(j==-1) return i+1;

        if(dp[i][j]!=-1){
            return dp[i][j];

        }
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]=findDist(i-1,j-1, w1, w2,dp);
        }else{
           int del=  findDist(i-1,j, w1, w2,dp);
           int ins= findDist(i,j-1, w1, w2,dp);
           int rep= findDist(i-1,j-1, w1, w2,dp);
             return dp[i][j]=1+Math.min(del,Math.min(ins, rep));

        }
       
        
    }
    public int minDistance(String w1, String w2) {
        int m =w1.length();
        int n= w2.length();
        StringBuilder sb1= new StringBuilder(w1);
        StringBuilder sb2= new StringBuilder(w2);
        int dp[][]= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= -1;
            }
        }
        return findDist(m-1,n-1,w1,w2,dp);
        
    }
}