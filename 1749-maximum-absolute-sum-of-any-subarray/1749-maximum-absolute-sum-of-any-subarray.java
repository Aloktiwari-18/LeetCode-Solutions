class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n= nums.length;
        int bestEnd=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            bestEnd= Math.max(bestEnd+nums[i], nums[i]);;


            res= Math.max(res, bestEnd);


        } 

        int worstEnd=nums[0];
        int abs= nums[0];
        for(int i=1;i<n;i++){
            worstEnd= Math.min(worstEnd+nums[i], nums[i]);
            abs= Math.min(abs, worstEnd);

        }
        return Math.max(res, Math.abs(abs));
       
    }
}