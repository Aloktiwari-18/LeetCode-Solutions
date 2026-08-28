class Solution {
    public int maxProfit(int[] prices) {

        int buy=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-buy>0){
                max+=prices[i]-buy;
            }
            buy= prices[i];
        }
        return max;
        
    }
}