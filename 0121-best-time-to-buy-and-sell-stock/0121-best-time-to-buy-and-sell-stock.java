class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int futSell[]= new int[prices.length];
        futSell[n-1]= prices[n-1];
        for(int i=n-2;i>=0;i--){
            futSell[i]= Math.max(futSell[i+1], prices[i]);
        }
        int maxProfit=0;

        for(int i=0;i<n;i++){
                maxProfit= Math.max(maxProfit , futSell[i]- prices[i]);
        }
        return maxProfit;
        
    }
}