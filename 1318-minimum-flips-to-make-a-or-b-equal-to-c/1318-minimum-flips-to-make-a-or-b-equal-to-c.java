class Solution {
    public int minFlips(int a, int b, int c) {
        int temp=a;
        int temp2=b;
        int temp3=c;
        int count=0;
        while(temp>0 || temp2>0  || temp3>0){
            if((temp3&1)==1 && ((temp&1)==0 && (temp2&1)==0 )){
                count++;
            }
            else if((temp3&1)==0 && ((temp&1)==1 && (temp2&1)==1)){
                count+=2;
            }
            else if((temp3&1)==0 && ((temp&1)==1 || (temp2&1)==1)){
                count++;
            }
            
            temp>>=1;
            temp2>>=1;
            temp3>>=1;
        }
        return count;
        
        
    }
}