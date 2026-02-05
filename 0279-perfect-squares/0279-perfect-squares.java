class Solution {
    public static boolean isPerfact(int n){
        int sqr= (int)Math.sqrt(n);
        return (sqr*sqr==n);
    }
    public int numSquares(int n) {
        int dp[]= new int[n+1];
        for(int i=1;i<=n;i++){
            if(isPerfact(i)) dp[i]=1;
            else{
                int min=Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    int count= dp[j*j]+dp[i-j*j];
                    min=Math.min(min,count);
                }
            dp[i]=min;
            }
        }
        return dp[n];        
    }
}