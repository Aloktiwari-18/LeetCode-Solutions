class Solution {
     private int atMost(int [] nums,int goal){
        int left=0;
        int right=0;
        int count=0;
        int n=nums.length;
        int sum=0;
        while(right<n){
            if(goal<0) return 0;
            
            sum+=nums[right]%2;
            while(sum>goal){
                sum=sum-nums[left]%2;
                left=left+1;
            }
            count=count+(right-left+1);           
            right++;

        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
                        return atMost(nums, k) - atMost(nums, k - 1);

        
    }
}