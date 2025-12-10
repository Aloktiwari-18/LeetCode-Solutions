class Solution {
    private int atMost(int [] nums,int goal){
        int left=0;
        int right=0;
        int count=0;
        int n=nums.length;
        int sum=0;
        while(right<n){
            if(goal<0) return 0;
            
            sum+=nums[right];
            while(sum>goal){
                sum=sum-nums[left];
                left=left+1;
            }
            count=count+(right-left+1);           
            right++;

        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
                return atMost(nums, goal) - atMost(nums, goal - 1);

        
        
    }
}