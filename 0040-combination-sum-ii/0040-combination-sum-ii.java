class Solution {
    public void solve(int cand[], int idx, int sum, int target,  boolean used[], List<Integer> subAns, List<List<Integer>> ans){
        
            if(sum==target){
                ans.add(new ArrayList<>(subAns));
                return;
            }
            

        
        if (idx >= cand.length || sum > target) {
            return;
        }

        for(int i=idx;i<cand.length;i++){
            if(used[i]) continue;
            if(i>idx && cand[i]==cand[i-1] && !used[i-1]) continue;
            if(sum+cand[i]>target){
                break;
            }
            sum+=cand[i];
            used[i]=true;
            subAns.add(cand[i]);
            solve(cand, i+1, sum, target, used, subAns, ans);
            subAns.remove(subAns.size()-1);
            sum-=cand[i];
            used[i]=false;
            }
    }
        
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> subAns= new ArrayList<>();
        boolean used[]= new boolean[cand.length];
        solve(cand, 0, 0, target,used, subAns, ans);
        
        return ans;

        
    }
}