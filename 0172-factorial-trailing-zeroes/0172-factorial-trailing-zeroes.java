class Solution {
    public int trailingZeroes(int n) {
        if(n<5) return 0;
        int sum=0;
        int res=5;
        while(res<=n){
            sum+=n/res;
            res=res*5;
        }
return sum;

    }
}