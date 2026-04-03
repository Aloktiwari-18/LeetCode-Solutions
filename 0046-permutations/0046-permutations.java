class Solution {
    public static void permutation(int [] nums, boolean[] vis, List<List<Integer>> ans, List<Integer> a){
        int n= nums.length;
        for(int i=0;i<n;i++){
        if(a.size()==n){
            List<Integer> copy= new ArrayList<> (a);
            ans.add(copy);
            return;
        }
            if(!vis[i]){
                a.add(nums[i]);
                vis[i]=true;
                permutation(nums, vis, ans, a);
                a.remove(a.size()-1);
                vis[i]=false;
            }


        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n= nums.length;
        boolean [] vis=new boolean [n];
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> a= new ArrayList<>();

        permutation(nums, vis, ans, a );
        return ans;
        
    }
}