class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n= A.length;
        for(int ele[]: A){
            for(int i=0;i*2<n;i++){
                if(ele[i]==ele[n-i-1]){
                    ele[i]= ele[n-i-1]^=1;
                }
            }
        }
        return A;

        
    }
}