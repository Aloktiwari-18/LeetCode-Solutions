class Solution {
    public int maxProduct(int[] nums) {
        int ltr=1;
        int rtl=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(ltr==0){
                ltr=1;

            }
            if(rtl==0){
                rtl=1;
            }
            ltr*=nums[i];
            int j= nums.length-i-1;
            rtl*=nums[j];

            ans=Math.max(ans, Math.max(ltr, rtl));
        }
        return ans;
    }
}