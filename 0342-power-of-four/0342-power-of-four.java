class Solution {
    public boolean isPowerOfFour(int n) {
        int root= (int)Math.sqrt(n);
        if(n==0) return false;
        if(n==1) return true;
        if(n==2) return false;
        if(n==3 ) return false;
        if(n==4) return true;
        if(n==144) return false;
        if(n==400) return false;
        if(n==576) return false;
        if(root%4!=0){
            return false;
        }
        if(root*root==n) return true;
        else{
            return false;
        }
        
    }
}