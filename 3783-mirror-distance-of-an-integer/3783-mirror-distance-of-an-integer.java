class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        int num=0;
        while(n>0){
            int rev=n%10;
             num=num*10+rev;
            n=n/10;
        }
        return Math.abs(org-num);


        
    }
}