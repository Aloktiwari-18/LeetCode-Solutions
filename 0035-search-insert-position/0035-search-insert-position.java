class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid= (st+end)/2;
            if(nums[mid]==target){
                return mid;
            }
           else if(target>nums[st] && target<nums[mid]){
                        end=mid-1;

            }
            else if(target>nums[mid] && target<=nums[end]){
                st=mid+1;
            }
            else if(target>nums[mid] && target> nums[end]){
                return end+1;
            }else{
                return st;
            }
        }
        return -1;
    }
}