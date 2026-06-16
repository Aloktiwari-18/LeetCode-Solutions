class Solution {
    public int triangularSum(int[] nums) {
        int n= nums.length;
        int currlen= n-1;
        while(currlen>=1){
            for(int i=0;i<=currlen-1;i++){
                nums[i]= (nums[i]+nums[i+1])%10;
            }
            currlen--;
        }
    return nums[0];
    }
}