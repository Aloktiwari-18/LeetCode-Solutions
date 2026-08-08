class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int maxAns= nums[0];
        int min= nums[0];
        int minAns= nums[0];
        for(int i=1;i<nums.length;i++){
            maxAns=Math.max(maxAns+nums[i], nums[i]);
            max=Math.max(maxAns, max);
            minAns=Math.min(minAns+nums[i], nums[i]);
            min=Math.min(min, minAns);
        }
        return Math.max(max, Math.abs(min));
        
    }
}