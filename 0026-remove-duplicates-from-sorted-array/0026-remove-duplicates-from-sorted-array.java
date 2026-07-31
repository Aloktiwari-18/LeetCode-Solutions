class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;

        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[left]){
                left++;
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;

            }
        }
        return left+1;
        
    }
}