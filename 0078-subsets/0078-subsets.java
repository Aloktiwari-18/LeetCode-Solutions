class Solution {
    public static void f(int idx, int nums[], List<Integer> temp, List<List<Integer>> ans){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(temp));
            return ;

            
        }
        temp.add(nums[idx]);
        f(idx+1, nums, temp, ans);
        temp.remove(temp.size()-1);
        f(idx+1, nums, temp, ans);


    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();

        f(0, nums, temp,ans);
        return ans;


        
    }
}