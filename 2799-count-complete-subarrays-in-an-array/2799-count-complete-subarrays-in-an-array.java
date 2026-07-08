class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        int ans=0;
        int left=0;
        int right=0;
        HashSet<Integer> set= new HashSet<>();
        for(int ele: nums){
            set.add(ele);
        }
        
        int k=set.size();

        while(right<n){
            int e= nums[right];

            map.put(e, map.getOrDefault(e, 0)+1);
            
        while(map.size()==k){
             ans+=n-right;
            int ele=nums[left];
            map.put(ele, map.get(ele)-1);
            left++;

            if(map.get(ele)==0){
                map.remove(ele);
            }

          

        }
        right++;

        }
        return ans;
        
        
    }
}