class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        
        for(int ele:nums){
            xor^=ele;
        }
      int  mask=(xor & (xor-1))^xor;
        int a1=0;
        int a2=0;
       for(int ele:nums){
        if((ele & mask)!=0){
            a1^=ele;
        }else{
            a2^=ele;
        }

       }
       return new int[]{a1,a2};

        
    }
}