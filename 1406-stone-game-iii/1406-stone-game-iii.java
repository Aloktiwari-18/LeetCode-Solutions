class Solution {
    public int helper(int []stVal, int i, int []dp){
        int n=stVal.length;
        if(i>=n) return 0;
        if(dp[i]!=Integer.MIN_VALUE){
            return dp[i];
        }
        int take=0;
        int ans=Integer.MIN_VALUE;
        for(int k=0;k<3 && i+k<n;k++){
            take+=stVal[i+k];
            ans=Math.max(ans, take-helper(stVal, i+k+1, dp));
        }
        return dp[i]=ans;
    }

    
    public String stoneGameIII(int[] stVal) {
        int dp[]= new int[stVal.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int diff=helper (stVal, 0, dp);
        if(diff==0){
            return "Tie";
        }
        else if(diff>0){
                return "Alice";
        }else{
            return "Bob";
        }

        
       
        
    }
}