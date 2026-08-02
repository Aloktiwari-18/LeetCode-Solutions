class Solution {
    public boolean stoneGame(int[] piles) {
        int aliceFront =0;
        int aliceBack=0;
        int bobFront=0;
        int bobBack=0;

        int st=0;
        int end=piles.length-1;
        for(int i=st;i<end;i++){
            if(i%2==0){
                aliceFront+=piles[i];
            }else{
                bobFront+=piles[i];
            }
        }
        for(int i=end;i>=0;i--){
            if(i%2!=0){
                aliceBack+=piles[i];
            }else{
                bobBack+=piles[i];
            }
        }

        if(aliceFront>bobFront || aliceBack>bobBack){
            return true;
        }else{
            return false;
        }
        
    }
}