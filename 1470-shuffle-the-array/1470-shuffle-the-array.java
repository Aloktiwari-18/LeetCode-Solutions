class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start=0;
        int end= nums.length-n;
        int arr[]=new int[2*n];
        int k=0;

        while(end<=2*n-1){
            arr[k]=nums[start];
            k++;
            arr[k]=nums[end];
            k++;
            start++;
            end++;
           



        }
        return arr;

       
        
    }
}