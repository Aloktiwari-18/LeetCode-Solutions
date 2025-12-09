class Solution {
    public int longestOnes(int[] nums, int k) {
        // int maxlen=0;
        // for(int i=0;i<nums.length;i++){
        //     int zeros=0;
        //     int len=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //             zeros++;

        //         }
        //         if(zeros<=k){
        //             len=j-i+1;
        //             maxlen=Math.max(len,maxlen);
        //         }
        //     }
        // }
        // return maxlen;

        int maxlen=0;
        int left =0;
        int right=0;
        int zeros=0;
        int n=nums.length;
        while(right<n){
            int len=0;
            if(nums[right]==0) zeros++;
            while(zeros>k){
                if(nums[left]==0) zeros--;  
                left++;             
            }
            if(zeros<=k){
                len=right-left+1;
                maxlen=Math.max(len,maxlen);
            }
            right++;


        }
        return maxlen;
        
    }
}