class Solution {
    public int solve(int i, int [] nums, int []dp){
        if(dp[i]!=-1){
            return dp[i];
        }
        int max=1;
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                max=Math.max(max, 1+solve(j,nums,dp));
            }
        }
        return dp[i]=max;
    }
    public int lengthOfLIS(int[] nums) {
        int dp[]= new int[nums.length+1];
       
            Arrays.fill(dp, -1);
        
        int ans= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            ans= Math.max(ans, solve(i, nums, dp));
        }
    return ans;
        
    }
}