class Solution {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int n=nums.length;

        
        for(int ele: nums){
            if(ele>max3){
                max1=max2;
                max2=max3;
                max3=ele;
            }
          else  if(ele>max2){
                max1=max2;
                max2=ele;
            }
           else if(ele>max1){
                max1=ele;
            }
            if(ele<min1){
                min2=min1;
                min1=ele;
            }
           else if(ele<min2){
                min2=ele;
            }
            
        }
        int prod1= min1*min2*max3;
        int prod2=max1*max2*max3;
        return Math.max(prod1, prod2);

        
    }
}