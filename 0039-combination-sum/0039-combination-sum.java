class Solution {
    public void solve(int [] cand, int i, int sum ,List<Integer> subAns, List<List<Integer>> ans, int target){
        
        if(i>=cand.length){

            if(sum==target){
            ans.add(new ArrayList<>(subAns));
            
            
        }
        return ;
        }
        
        
        if(sum<=target){
            sum+=cand[i];
            subAns.add(cand[i]);
            solve(cand, i, sum, subAns, ans, target);
            sum-=cand[i];
            subAns.remove(subAns.size()-1);

        }
        solve(cand, i+1, sum, subAns, ans, target);

    }
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subAns= new ArrayList<>();

        solve(cand, 0, 0, subAns, ans, target);
        return ans;
        
    }
}