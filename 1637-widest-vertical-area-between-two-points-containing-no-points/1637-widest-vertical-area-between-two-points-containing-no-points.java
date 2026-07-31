class Solution {
    public int maxWidthOfVerticalArea(int[][] p) {
        Arrays.sort(p,(a,b)->
            Integer.compare(a[0],b[0])
        );

        int x1=p[0][0];
        int max=Integer.MIN_VALUE;
        for(int ele[]:p){
            int x2=ele[0];
            int diff=x2-x1;
            max=Math.max(max, diff);
            x1=x2;

        }
        return max;
        
    }
}