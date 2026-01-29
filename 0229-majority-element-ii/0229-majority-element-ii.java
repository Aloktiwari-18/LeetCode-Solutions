class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>n/3){
                ans.add(num);
            }
        }
        return ans;

        
    }
}