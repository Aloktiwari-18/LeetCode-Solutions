class Solution {
    public long hours(int speed,int [] piles){
        long h=0;
        for(int ele:piles){
            if(ele % speed==0) h+=ele/speed;
            else h+=(ele/speed)+1;

        }
        return h;



    }
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
       int  hrs=0;

        int max= Integer.MIN_VALUE;
        for(int ele: piles){
            max=Math.max(ele, max);
        }
        int low= 1;
        int high= max;
        int ans=max;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(hours(mid,piles)<=h){
                high= mid-1;
                ans=mid;
            }
            else low= mid+1;
        }
        return ans;


        
    }
}