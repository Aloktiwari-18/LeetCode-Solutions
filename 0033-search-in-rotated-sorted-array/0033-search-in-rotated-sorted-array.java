class Solution {
    int ans=-1;
    public void funct(int [] nums, int st, int end, int target){
            if(st>end) return;
         int mid=(st+end)/2;
            if(nums[mid]==target){
               ans= mid;
               return ;
            }
            if(nums[st]<=nums[mid]){
                if(target>=nums[st]  && target<=nums[mid]){
                    funct(nums, st, mid-1, target);
                }else{
                    funct(nums, mid+1, end, target);
                }

            }
            else{
                if(target>=nums[mid]  && target<=nums[end]){
                    funct(nums, mid+1, end, target);
                }else{
                    funct(nums, st, mid-1, target);
                }

            }

 }
    public int search(int[] nums, int target) {
       funct(nums, 0, nums.length-1, target);
       return ans;
        
    }
}


