class Solution {
    public static void conqour(int nums[], int st, int mid, int end){
        int left=st;
        int right=mid+1;
        int arr[]= new int[end - st + 1];
        int k=0;
        while(left<=mid && right<=end){
            if(nums[left]<=nums[right]){
                arr[k++]= nums[left++];
            }else{
                arr[k++]= nums[right++];
            }
           

        }
         while(left<=mid){
                arr[k++]= nums[left++];
            }
            while(right<=end){
                arr[k++]=nums[right++];
            }
            
            for(int i=0;i<arr.length;i++){
               nums[st+i]=arr[i];
            }
    }
    public static void divide(int nums[], int st, int end){
        if(st>=end) return;
        int mid= (st+end)/2;
        divide(nums, st, mid);
        divide(nums, mid+1, end);
        conqour(nums, st, mid, end);
        

    }
    public int[] sortArray(int[] nums) {
        if(nums.length<=1) return nums;
         divide(nums, 0, nums.length-1);
         return nums;

    }
}