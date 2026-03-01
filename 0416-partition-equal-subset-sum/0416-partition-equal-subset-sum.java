class Solution {
    public boolean subset(int i, int [] nums, int target, int [][] dp){
        if(i==nums.length){
            if(target==0){
                return true;
            }else return false;
        }
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean skip= subset(i+1, nums, target, dp);
        boolean ans= false;
        if(target-nums[i]<0){
            ans= skip;
        }else{
            boolean pick= subset(i+1, nums, target-nums[i],dp);
            ans=pick | skip;
        }
        if(ans){
            dp[i][target]=1;

        }else{
            dp[i][target]=0;
        }
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        if(sum%2!=0){
            return false;
        }
        int N= nums.length;

        int target= sum/2;
        int dp[][]= new int [N][target+1];

        for(int i=0;i<N;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]= -1;
            }
        }
        return subset(0,nums,target,dp);


        
    }
}