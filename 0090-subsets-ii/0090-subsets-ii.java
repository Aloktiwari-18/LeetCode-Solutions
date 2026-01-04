class Solution {
    public void func(int[] nums, int idx, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) {continue;}
            temp.add(nums[i]);
            func(nums, i+1, temp, ans);
            temp.remove(temp.size()-1);

        }
        





    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        func(nums, 0, temp, ans);
        return ans;
        


        
    }
        
    }
