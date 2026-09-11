class Solution {
    public int trap(int[] height) {
        int trap=0;
        int n= height.length;
        int lM[]= new int[n];
        int rM[]= new int[n];
        lM[0]= height[0];
        rM[n-1]= height[n-1];
        for(int i=1;i<n;i++){
            lM[i]= Math.max(height[i], lM[i-1]);

        }
        for(int i=n-2;i>=0;i--){
            rM[i]= Math.max(height[i], rM[i+1]);
            
        }
        for(int i=0;i<n;i++){
            int waterLevel= Math.min(lM[i], rM[i]);
            int water=waterLevel-height[i];
            trap=trap+water;
        }
        return trap;
    }
}