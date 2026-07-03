class Solution {
    public int minStartValue(int[] nums) {
        int pre=0;
        int minVal=0;
        for(int num:nums){
            pre+=num;
            minVal= Math.min(minVal, pre);

        }
        return 1- minVal;
        
    }
}