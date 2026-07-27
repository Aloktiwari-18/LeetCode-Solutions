class Solution {
    public int maxProduct(int[] nums) {
        int max1= -1;
        int max2=-1;
        for(int ele:nums){
            if(ele>max2){
                max1=max2;
                max2=ele;
            }
            else if(ele>max1){
                max1=ele;
            }
        }
        return (max1-1)*(max2-1);
        
    }
}