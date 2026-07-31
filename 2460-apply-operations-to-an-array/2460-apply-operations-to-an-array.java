class Solution {
    public int[] applyOperations(int[] nums) {
        int n= nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                continue;
            }else{
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }

        }
        int count=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
                continue;
            }else{
               ans[k++]=nums[i]; 
            }
        }
        while(count-->0){
            ans[k++]=0;
        }
        return ans;
        
    }
}