class Solution {
    public int solve(int nums[], int maxor, int i, int curror){
        if(i==nums.length){
            return maxor==curror ?1:0;
        }
        if(maxor==curror){
            return 1<< (nums.length-i);
        }
        return solve(nums, maxor, i+1, curror|nums[i])+ solve(nums, maxor,i+1, curror);
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxor=0;
        
        for(int ele:nums){
            maxor|=ele;

        }
        return solve(nums, maxor,0,0 );
            
        }

            

        }

  