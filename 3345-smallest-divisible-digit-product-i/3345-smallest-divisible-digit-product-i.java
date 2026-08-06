class Solution {
    public int smallestNumber(int n, int t) {
        
        int min=Integer.MAX_VALUE;
        int chk=n+10;

        while(n<=chk){
            int prod=1;
            int i=n;
            while(i>0){
                 prod *= (i % 10);
                i=i/10;

            }
            if(prod%t==0){
                return n;
            }
            n++;

        }
        return -1;
       
    }
}