class Solution {
    public void rot(int [] nums, int i, int j){
        
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {

        
        int n=nums.length;

        k=k%n;
        
        rot(nums, 0, n-1);
        
        rot(nums, 0,k-1);
        rot(nums, k, n-1);
        
    }
}