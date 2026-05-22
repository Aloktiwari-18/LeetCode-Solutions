class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;

        int minPrefix=nums[0];
        int minSubSum= minPrefix;
        int maxPrefix=nums[0];
        int maxSubSum= maxPrefix;
        int sum=nums[0];
        for(int i=1;i<n;i++){

            maxPrefix=Math.max(maxPrefix+ nums[i], nums[i]);
            maxSubSum=Math.max(maxSubSum, maxPrefix);
            minPrefix=Math.min(minPrefix+ nums[i], nums[i]);
            minSubSum=Math.min(minSubSum, minPrefix);
            sum+=nums[i];
        }
        int ans1=maxSubSum; 
        int ans2= sum-minSubSum;

        if(ans2==0){
            return ans1;
        }
        System.out.print(sum);

        return Math.max(ans1, ans2);
        

        
    }
}