class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans=-1;
        int n= nums.length;
        int minArr[]= new int[n];
        int maxArr[]= new int[n];
        int st=0;
        int end=nums.length-1;
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        while(st<=end){
            max= Math.max(max, nums[st]);
            maxArr[st++]= max;
        }
        for(int i=0;i<n;i++){
             min = Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min= Math.min(nums[j], min);
                minArr[i]=min;
            }
        }

        for(int i=0;i<n;i++){
            
            if(maxArr[i]-minArr[i]<=k){
                return i;
               
            }
        }
return -1;
        
    }
}