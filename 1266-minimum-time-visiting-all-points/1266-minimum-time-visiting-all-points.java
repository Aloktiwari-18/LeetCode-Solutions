class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
       int a=0;
       int b=0;
       int min=0;
        for(int i=0;i<n-1;i++){
            a=Math.abs(points[i][0]-points[i+1][0]);
             b=Math.abs(points[i][1]-points[i+1][1]);

            int max= Math.max(a,b);
            min+=max;

        }
        return min;

        
        
    }
}