class Solution {
    public static long smallestdivisor(int nums[],int mid){
        long target=0;
        for(int i=0;i<nums.length;i++){
              long small=(nums[i]+mid-1L)/mid;
              target+=small;
        }
        return target;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            
        }
        
    
    int left=1;
    int right=max;
    int ans=Integer.MAX_VALUE;
    while(left<=right){
        int mid=(left+right)/2;
        long smallest=smallestdivisor(nums,mid);
        if(smallest<=threshold){
            ans=mid;
            right=mid-1;

        }else{
            left=mid+1;
        }
    }
        return ans;
    }
}