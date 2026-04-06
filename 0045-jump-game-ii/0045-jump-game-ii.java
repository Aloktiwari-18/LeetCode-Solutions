
class Solution {
    public static int calculate(int i, int [] arr, int [] dp){
        int n= arr.length;
        if(i>=n-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int jump= arr[i];
        if(jump==0) return Integer.MAX_VALUE;
        
        int mini=Integer.MAX_VALUE;
        for(int j=1;j<=arr[i]; j++){
            int next=calculate(i+j, arr, dp);

            if(next!=Integer.MAX_VALUE){
                 mini= Math.min(mini, 1+next);

            }
            
           
            
            
            
            
        }
        return dp[i]= mini;
        
        
        
        
    }
    public int jump(int[] arr) {
        int n= arr.length;
        int dp[]= new int [n];
        for(int i=0;i<n;i++){
            dp[i]= -1;
        }
        
        int ans= calculate(0, arr, dp);
        
        return ans == Integer.MAX_VALUE ? -1 : ans;

    }
}