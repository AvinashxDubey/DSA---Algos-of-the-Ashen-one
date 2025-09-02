class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        for(int r=1; r<prices.length; r++){
            int buy = prices[l];
            int sell = prices[r];
            if(buy<sell){
                maxProfit= Math.max(maxProfit, sell-buy);
            }
            else{
                l=r;
            }
        }
        return maxProfit;
    }
}