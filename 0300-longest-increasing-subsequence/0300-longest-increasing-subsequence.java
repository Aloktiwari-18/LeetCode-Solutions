class Solution {
    public int findlength(int i, int [] nums , int [] dp){
        
   
        if(dp[i]!=-1){
            return dp[i];
        }
        int max_length=1;
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                max_length=Math.max(max_length,1+findlength(j, nums, dp));
            }
            
            
        }
        dp[i]=max_length;
        return dp[i];
    }
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int dp[]= new int [n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int ans=1;
        for(int i=0;i<n;i++){
            ans= Math.max(ans, findlength(i, nums, dp)); 

        }
        return ans;
        
        
    }
}