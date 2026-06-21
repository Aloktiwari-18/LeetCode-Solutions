class Solution {
    int ans=-1;
    public void funct(int [] nums, int st, int end, int target){
            if(st>end) return;
         int mid=(st+end)/2;
        
           
            if(nums[mid]==target){
            ans= mid;
            }
            else if(nums[mid]>target){
                funct(nums, st, mid-1, target);
            }
            else if(nums[mid]<target){
                funct(nums, mid+1, end, target);
            }
            
        
    }
    public int search(int[] nums, int target) {
       funct(nums, 0, nums.length-1, target);
       return ans;
        
    }
}