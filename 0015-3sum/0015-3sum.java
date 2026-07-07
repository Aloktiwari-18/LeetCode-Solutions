class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int n=nums.length;
        if(n<3) return ans;    
        Arrays.sort(nums); 
        for(int i=0;i<n-2;i++){    
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }     
            if(nums[i]>0) break;   
            int sum= -1*nums[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                List<Integer> sub= new ArrayList<>();
                int s= nums[left]+nums[right];
                if(s==sum){
                    sub.add(nums[i]);
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    ans.add(sub);
                    left++;
                    right--;
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                    
                }
                else if(s<sum){
                    left++;
                }else{
                    right--;
                }    
            }
        }
        return ans;    
    }
}