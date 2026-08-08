class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int ltoR=1;
        int rtoL=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(ltoR==0){
                ltoR=1;
            }
            if(rtoL==0){
                rtoL=1;
            }
            ltoR*=nums[i];
            int j= n-i-1;
            rtoL*=nums[j];

            max=Math.max(max, Math.max(rtoL,ltoR));
           
        }
        return max;
        
    }
}