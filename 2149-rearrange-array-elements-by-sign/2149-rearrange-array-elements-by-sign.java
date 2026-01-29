class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n= nums.length;


        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg.add(nums[i]);

            }else {
                pos.add(nums[i]);
            }
        }
        int ans[] =new int[n];
        int posLen= pos.size();
        int negLen=neg.size();
        int idx=0;
        int left=0;
        int right=0;

        while(left<posLen && right<negLen){
            ans[idx++]=pos.get(left++);
            ans[idx++]=neg.get(right++);

        }
        while(left<posLen || right<negLen){
           ans[idx++]= pos.get(left++);
           ans[idx++]= neg.get(right++);

        }

        
       return ans;
    }
}