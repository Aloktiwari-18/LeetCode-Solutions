class Solution {
    public int solve(int idx, int [] nums, int sum, int [][] dp){
        if(sum==0){
            return 0;
        }
        if(idx>=nums.length || sum<0){
            return Integer.MAX_VALUE;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];

        }
        int take= solve(idx+1, nums, sum-nums[idx], dp);
        int skip= solve(idx+1, nums, sum, dp);
        return dp[idx][sum]=Math.min(take, skip);
    }
    public boolean canPartition(int[] nums) {
        int tot=0;
        for(int ele: nums){
            tot+=ele;
        }
        if(tot%2!=0){
            return false;
        }
         int sum=tot/2;
        int dp[][]= new int[nums.length+1][sum+1];
        for(int [] e:dp){
            Arrays.fill(e, -1);
        }
       
        int ans= solve(0, nums, sum, dp);
        return ans==Integer.MAX_VALUE ? false: true;
        

        
    }
}