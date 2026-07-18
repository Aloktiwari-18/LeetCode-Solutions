class Solution {
    public int[] evenOddBit(int n) {
        int even=0;
        int odd=0;
        if(n==0) return new int[]{0,0};
        int idx=0;
        while(n>0){
            if(idx%2==0) {
                if((n&1)==1){
                    even++;
                }
                
            }
            else if(idx%2!=0 & (n&1)==1) {
                    odd++;
            }
            idx++;
            n=n>>1;
            
        }
        
        return new int[]{even, odd};
            
        
    }
}