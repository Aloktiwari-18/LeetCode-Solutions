class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int n=nums.length;
        int right=0;
        int max= 0;
        int ans=0;
        int count=0;
        while(right<n){
            if(nums[right]==1){
                count++;
            }
            max= Math.max(max, count);
            if(right-left+1-max>k){
                if(nums[left]==1){
                    count--;
                }
                max=0;
                max=Math.max(count, max);
                left++;
            }
            if(right-left+1-max<=k){
                ans=Math.max(ans, right-left+1);
            }
            right++;
        }
        return ans;
        
    }
}