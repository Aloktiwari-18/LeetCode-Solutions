class Solution {
    public int lastOccur(int [] nums, int st, int end, int target){
        int ans=-1;
        while(st<=end){
            int mid= (st+end)/2;
            if(nums[mid]==target){
                ans= mid;
                st=mid+1;
            }
            else if(nums[mid]<target){
                st= mid+1;

            }else{
              end=mid-1;
            }
        }
        return ans;
    }
    public int firstOccur(int [] nums, int st, int end, int target){
        int ans=-1;
        while(st<=end){
            int mid= (st+end)/2;
            if(nums[mid]==target){
                ans= mid;
                end= mid-1;
            }
            else if(nums[mid]<target){
                st= mid+1;
            }
            else{
            end=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[]= {-1, -1};
        int first= firstOccur(nums, 0, nums.length-1, target);
        int last= lastOccur(nums, 0, nums.length-1, target);
        res[0]= first;
        res[1]=last;
        System.out.print(first);
        System.out.print(last);
        return res;

        
    }
}