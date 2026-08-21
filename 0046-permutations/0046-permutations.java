class Solution {
    public void solve(int [] nums, HashSet<Integer> set, List<Integer> sub,  List<List<Integer>> ans){
        if(sub.size()==nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                sub.add(nums[i]);
                set.add(nums[i]);
            
            solve(nums, set, sub, ans);
            sub.remove(sub.size()-1);
            set.remove(nums[i]);
        }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();

        solve(nums,set,sub, ans);
        return ans;
        
    }
}