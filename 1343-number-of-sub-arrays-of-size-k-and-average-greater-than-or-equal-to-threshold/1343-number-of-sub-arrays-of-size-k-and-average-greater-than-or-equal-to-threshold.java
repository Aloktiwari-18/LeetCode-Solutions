class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n= arr.length;
        int count=0;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];

            if(right-left+1==k){
                int avg=sum/k;
                if(avg>=threshold){
                    count++;
                }
                sum-=arr[left];
                left++;
            }

        }
        return count;
        
    }
}