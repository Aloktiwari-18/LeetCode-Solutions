class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int max=0;
        int buy= prices[0];
        for(int i=1;i<n;i++){
            int num=prices[i];

            if(num-buy>0){
                max+=num-buy;
                
            }
            buy= prices[i];

        }
        return max;
        
    }
}