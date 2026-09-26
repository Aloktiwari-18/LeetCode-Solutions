class Solution {
    public int solve(int cap, int[] w){
        int day=1;
        int sum=0;
        for(int ele: w){
            sum+=ele;
            if(sum>cap){
                day++;
                sum=0;
                sum+=ele;
            }
            

        }
        return day;
    }
    public int shipWithinDays(int[] w, int days) {
        int sum=0;
        int low=0;
        for(int ele: w){
            low=Math.max(low, ele);
            sum+=ele;

        }
        
        int high=sum;
        int ans=sum;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(solve(mid, w)<=days){
                ans=mid;
                high=mid-1;
            }else{
                low= mid+1;
            }
        }
        return ans;


        
    }
}