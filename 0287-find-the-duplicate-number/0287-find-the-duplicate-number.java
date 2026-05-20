class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int ele:nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){
                ans= entry.getKey();
            }
        }

        return ans;

    }
}