class Solution {
    public static int atMost(int [] nums, int k){
        int right=0;
        int left=0;
        int n= nums.length;
        int count=0;
        HashMap<Integer, Integer> map= new HashMap<>();

        while(right<n){
            int num= nums[right];
            map.put(num, map.getOrDefault(num,0)+1);
            while(map.size()>k){
                int num1= nums[left];
                map.put(num1, map.get(num1)-1);
                if(map.get(num1)==0){
                    map.remove(num1);
                }
                left++;

            }
            count+=right-left+1;
            
            right++;


        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums, k-1);

        
        
    }
}