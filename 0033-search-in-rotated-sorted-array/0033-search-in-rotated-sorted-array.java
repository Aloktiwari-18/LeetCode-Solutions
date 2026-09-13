class Solution {
    int ans=-1;
    public void solve(int [] nums, int st, int end, int target){
        int mid= (st+end)/2;
        if(st>end){
            return ;
        }
        if(nums[mid]==target){
          ans=mid;
          return;
        }
        

        if(nums[st]<=nums[mid]){
                if(target>=nums[st] && target<=nums[mid]){
                    solve(nums, st, mid-1,target);
                }else{
                    solve(nums, mid+1, end,target);
               
                }
            }
        else{
            if(target>=nums[mid] && target<=nums[end]){
                solve(nums, mid+1, end,target);
            }else{
                solve(nums, st, mid-1 ,target);
            }
        }
       
    }
    public int search(int[] nums, int target) {
         solve(nums, 0 ,nums.length-1,target);
         return ans;
        
            
        
        
    }
}