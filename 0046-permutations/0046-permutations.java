class Solution {
    public static void allPermute(int nums[], List<Integer> ds,List<List<Integer>> ans, boolean [] freq){

    
    if(ds.size()==nums.length){
        ans.add(new ArrayList<>(ds));
        return;
    }
    for(int i=0;i<nums.length;i++){
        if(!freq[i]){
            freq[i]=true;
            ds.add(nums[i]);
            allPermute(nums, ds,ans,freq);
            ds.remove(ds.size()-1);
            freq[i]=false;
            
        }
                }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n= nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();

        boolean [] freq= new boolean[n];

        allPermute(nums,ds,ans, freq);
        return ans;
    

    

        
    }
}