class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int maxValue[]= new int[n];
        maxValue[n-1]= prices[n-1];

        for(int i=n-2;i>=0;i--){
            maxValue[i]=Math.max(prices[i],maxValue[i+1]);
        }

        int maxPro= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int value= Math.abs(prices[i]-maxValue[i]);
            maxPro= Math.max(value, maxPro);
        }
        return maxPro;

        
    }
}