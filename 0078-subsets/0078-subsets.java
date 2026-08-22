class Solution {
    public void solve(int [] nums, int i, List<Integer> subAns, List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(subAns));
            return ;
            
        }
    
    
            subAns.add(nums[i]);
            solve(nums, i+1, subAns, ans);
            subAns.remove(subAns.size()-1);
            solve(nums, i+1, subAns, ans);
        
            
            
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subAns= new ArrayList<>();
        

        solve(nums, 0, subAns, ans);
        return ans;
        
    }
}