class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        int n= nums.length;
        if(n<2){
            return 1;

        }
        int up=1;
        int d=1;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]) up=d+1;
            else if(nums[i]>nums[i-1]) d=up+1;
        }
        return Math.max(up,d);
    }
}