class Solution {
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
        int num= Integer.bitCount(i);
        if(isPrime(num)){
            count++;
        }
    }
    return count;

        
    }
}