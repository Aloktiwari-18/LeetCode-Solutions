class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n= arr.length;
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        
        while(right<n){
            sum+=arr[right];
            while(sum>=target){
                min= Math.min(min, right-left+1);
                sum=sum-arr[left];
                left++;
            }
            
            right++;


        }
       if(min==Integer.MAX_VALUE){
        return 0;
       }else{
        return min;
       }
        
    }
}