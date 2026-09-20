class Solution {
    public int solve(int st, int [] nums, int end, int dp[]){
        if(st>end){
            return 0;
        }
        if(dp[st]!=-1){
            return dp[st];
        }
        int take= nums[st]+ solve(st+2, nums, end, dp);
        int skip= solve(st+1, nums, end, dp);
        return dp[st]= Math.max(take, skip);
    }
    public int rob(int[] nums) {
        if(nums.length<2){
                return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        int dp1[]= new int[nums.length+1];
        int dp2[]= new int[nums.length+1];
        int n= nums.length;
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(solve(0, nums, n -2, dp1), solve(1, nums, n-1, dp2));
        
    }
}