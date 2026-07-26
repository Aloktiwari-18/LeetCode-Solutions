class Solution {
    public int maxProduct(int n) {
        int max1=-1;
        int max2=-1;
        while(n!=0){
            int num= n%10;
            if(num>max1){
                max2=Math.max(max1, max2);
                max1=num;
            }else{
                max2= Math.max(num, max2);
            }
            n=n/10;
        }
        return max1*max2;
        
    }
}