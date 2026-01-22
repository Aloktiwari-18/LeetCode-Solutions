class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        int maxCount=0;

        while(right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            count++;
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                count--;

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                    
                }
                left++;
   
            }

            if(map.get(nums[right])<=k){
                maxCount=Math.max(maxCount, count);
                
            }
            right++;
        }
        return maxCount;
        
    }
}