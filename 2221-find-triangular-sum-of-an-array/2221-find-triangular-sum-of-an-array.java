class Solution {
    public int triangularSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            sub.add(nums[i]);
        }
        ans.add(sub);
        
        for(int i=0;i<nums.length-1;i++){
            List<Integer> temp= new ArrayList<>();
            for(int j=0;j<ans.get(i).size()-1;j++){
                int a=ans.get(i).get(j)+ ans.get(i).get(j+1);
                if(a>=10) {
                    a=a%10;
                }
                temp.add(a);
                

            }
            ans.add(temp);
            
        }
        return ans.get(ans.size()-1).get(0);

        
    }
}