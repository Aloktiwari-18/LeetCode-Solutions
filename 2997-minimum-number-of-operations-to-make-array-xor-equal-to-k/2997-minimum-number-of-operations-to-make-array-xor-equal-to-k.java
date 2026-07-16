class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        int n= nums.length;

        for(int i=0;i<n;i++){
            k^=nums[i];
            
        }
        return Integer.bitCount(k);
        


    }
}