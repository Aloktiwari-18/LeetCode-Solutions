class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int [] list= new int[n];

        for(int i=0;i<n;i++){
            list[i]=1;
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    list[i]=Math.max(list[i], list[j]+1);
                }
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,list[i] );
        }
        return max;



        
    }
}