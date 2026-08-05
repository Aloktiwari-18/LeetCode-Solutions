class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int n= nums.length;
        int count=0;
        int max=0;
        int ans=0;
        while(right<n){
            if(nums[right]==1){
                count++;

            }
            max=Math.max(max, count);
            if(right-left+1-max>1){
                    if(nums[left]==1){
                        count--;
                    }
                    left++;
                    max=Math.max(max, count);
            }
            if(right-left+1-max<=1){
                ans= Math.max(right-left+1, ans);
            }
            right++;
        }
        return ans-1;
        

    }
}