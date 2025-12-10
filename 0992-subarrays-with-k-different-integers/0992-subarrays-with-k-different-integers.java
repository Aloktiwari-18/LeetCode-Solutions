class Solution {
    private int atMost(int [] nums,int k){
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count =0;
        int n=nums.length;
        while(right<n){
            int num=nums[right];
            map.put(num,map.getOrDefault(num,0)+1);

            while(map.size()>k){
                int nums1=nums[left];
                map.put(nums1,map.get(nums1)-1);
                if(map.get(nums1)==0){
                    map.remove(nums1);
                }
                left=left+1;
            }
            count=count+(right-left+1);
            right++;

        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
        
    }
}