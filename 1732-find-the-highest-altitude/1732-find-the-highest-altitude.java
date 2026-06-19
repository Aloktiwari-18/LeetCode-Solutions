class Solution {
    public int largestAltitude(int[] gain) {
        
        int n= gain.length;

        int ans[]= new int [n+1];
        ans[0]=0;
        int max=0;
        for(int i=0;i<n;i++){
            ans[i+1]= ans[i]+gain[i];
            max=Math.max(ans[i]+gain[i], max);
        }
        return max;
    }
}