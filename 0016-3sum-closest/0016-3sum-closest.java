class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n= nums.length;
        int ans= 0;
        
        Arrays.sort(nums);
        int max_diff= nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){            
            int left=i+1;
            int right= n-1;
            while(left<right){
                int sum= nums[i]+ nums[left]+nums[right];
            if(Math.abs(target-sum)<Math.abs(target-max_diff)){
                    max_diff= sum;                
            }      
             if(sum<target){
                left++;
            }else  if(sum>target){
                right--;
            }else{
                return target;
            }

            }

        }     
        return max_diff;
    }

}
