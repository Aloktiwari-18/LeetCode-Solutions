class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int leftSum[]= new int[n];
        int rightSum[]= new int[n];
        leftSum[0]=0;
        rightSum[n-1]=0;
        int left=nums[0];
        int right=nums[n-1];
        for(int i=1;i<n;i++){
            
            leftSum[i]= left;
            left=left+ nums[i];

        }
        for(int i=n-2;i>=0;i--){
            rightSum[i]= right;
            right= right+nums[i];
        }
        int result[]= new int[n];
        for(int i=0;i<n;i++){
            result[i]= Math.abs(leftSum[i]-rightSum[i]);
        }
        return result;
        
    }
}