class Solution {
    public static void f(int nums[], boolean [] vis, List<Integer> temp, List<List<Integer>> ans){
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(temp.size()==nums.length){
                ans.add(new ArrayList<>(temp));
                return;
            }
            if(!vis[i]){
                temp.add(nums[i]);
                vis[i]=true;
                f(nums, vis, temp,ans);
                temp.remove(temp.size()-1);
                vis[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n= nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        boolean [] vis= new boolean [n];
        List<Integer> temp= new ArrayList<>();
        f(nums, vis, temp, ans);
        return ans;
        
    }
}