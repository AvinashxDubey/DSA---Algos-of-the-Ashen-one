class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0, right=0;//left represents buy and right represents sell
        while(right<prices.length){
            int buyPrice = prices[left];
            int sellPrice = prices[right];
            if(buyPrice<sellPrice){
                int currProfit = sellPrice-buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            }
            else{
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}