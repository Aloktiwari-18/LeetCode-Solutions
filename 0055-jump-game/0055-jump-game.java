class Solution {
    public static boolean isJump(int idx, int nums[], Boolean [] dp){
        if(idx>=nums.length-1) return true;
        if(dp[idx]!=null) return dp[idx];
        for(int i=idx+1;i<=idx+nums[idx];i++){
            if(isJump(i, nums, dp)) return dp[idx]= true;
        }
        return dp[idx]=false;
    }
    public boolean canJump(int[] nums) {
        Boolean dp[]= new Boolean[nums.length];
        return isJump(0, nums, dp);
    }
}