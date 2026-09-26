class Solution {
    public int maxProfit(int[] prices) {
        int max= Integer.MIN_VALUE;
        int buy= prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy= prices[i];
            }else{
                max=Math.max(prices[i]-buy, max);
                
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }else{
                return max;
        }
        
        
    }
}