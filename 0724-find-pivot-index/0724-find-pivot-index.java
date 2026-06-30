class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int pre[]= new int[nums.length];
       int suf[]= new int[nums.length];

       pre[0] =0;
       suf[nums.length-1]=0;
       for(int i=1;i<n;i++){
            pre[i]= pre[i-1]+nums[i-1];
       }

       for(int i=n-2;i>=0;i--){
            suf[i]= suf[i+1]+nums[i+1];
       }

       for(int i=0;i<n;i++){
        if(pre[i]==suf[i]){
            return i;
        }
       }
return -1;

        
    }
}