class Solution {
    
    public void moveZeroes(int[] nums) {
        
        int n=nums.length;
        int len=n;
        int k=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
                continue;
            }else{
                nums[k++]=nums[i];
            }
        }
        while(count-->0){
            nums[k++]=0;
        }
        
        
        
    }
}