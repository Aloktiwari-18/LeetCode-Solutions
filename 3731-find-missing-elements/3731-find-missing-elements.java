class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int n=nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int ele:nums){
            min=Math.min(min, ele);
            max=Math.max(max, ele);
            set.add(ele);

        }
        List<Integer> ans= new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }

        }
        return ans;
        
    }
}