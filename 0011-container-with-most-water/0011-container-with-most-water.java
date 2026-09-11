class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int st=0;
        int end=height.length-1;
        while(st<end){
            int minH= Math.min(height[st], height[end]);
            int w= end-st;
            int ccp= minH*w;
            max= Math.max(ccp, max);
            if(height[st]<height[end]){
                st++;
            }else{
                end--;
            }
        }
        return max;

        
    }
}