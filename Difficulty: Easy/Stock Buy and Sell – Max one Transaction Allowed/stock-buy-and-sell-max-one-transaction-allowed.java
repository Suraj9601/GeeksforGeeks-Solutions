class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int maxProfit = 0;
        int minBuy = prices[0];
        
        
        
        for(int i = 1; i < prices.length; i++) {
            int curr = prices[i];
            if(curr > minBuy) {
                maxProfit = Math.max(maxProfit, curr - minBuy);
            }
            
            if(curr < minBuy) {
                minBuy = curr;
            }
        }
        return maxProfit;
    }
}