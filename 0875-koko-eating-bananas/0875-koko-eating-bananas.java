class Solution {
    public long solve(int mid, int []piles){
        long h=0;
        for(int ele: piles){
            if(ele%mid==0){
                h+=ele/mid;
            }else{
                h+=(ele/mid)+1;

            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int ele: piles){
            max=Math.max(ele, max);
        }
        int low=1;
        int high= max;
        int ans=max;

        while(low<=high){
            int mid= low+(high-low)/2;

            if(solve(mid, piles)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

        
    }
}