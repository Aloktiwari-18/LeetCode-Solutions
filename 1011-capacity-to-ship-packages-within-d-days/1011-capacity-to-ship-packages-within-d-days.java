class Solution {
    
        public static int getDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w > capacity) {
                days++;
                load = 0;
            }
            load += w;
        }
        return days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){
            right+=weights[i];
            left=Math.max(left,weights[i]);
        }
        
        int ans=right;
        while(left<=right){
            int mid=(left+right)/2;
            int minDays=getDays(weights,mid);
            if(minDays<=days){
                ans=mid;
                right=mid-1;

            }else{
                left=mid+1;
            }

        }
        return ans;
        
    }
}