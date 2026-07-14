class Solution {
    public boolean isPowerOfTwo(int n){
            return ((n & (n-1))==0 );
        }

    public boolean isSquare(int n){
        int r= (int)Math.sqrt(n);
        return r*r==n;
    }
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        return (isPowerOfTwo(n) & isSquare(n)) ;
        
        
    }
}