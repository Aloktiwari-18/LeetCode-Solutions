class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        int n= nums.length;
        for(int bit=0;bit<32;bit++){
            int countOne=0;
            for(int num:nums){
                if(((num>>bit)&1)==1){
                    countOne++;
                }
               
            }
            ans+=countOne*(n-countOne);

        }
        return ans;
        
    }
}