class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n= nums.length;
        int k=0;
        int res[]= new int[n];
        for(int i=0;i<n;i++){
            res[k++]= nums[i]*nums[i];
        }
         Arrays.sort(res);
         return res;
    }
}