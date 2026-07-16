class Solution {
    public int countBit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static boolean isPrime(int n)
{
    if(n<2){
        return false;

    }
    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}    
public int countPrimeSetBits(int left, int right) {
    int count=0;
    for(int i=left; i<=right;i++){
        int num= countBit(i);
        if(isPrime(num)){
            count++;
        }
    }
    return count;

        
    }
}