class Solution {
    public int maxProfit(int[] prices) {
        
        int lastBuy = -prices[0];
        int lastSold = 0;
        
        for(int i = 1 ; i < prices.length ; i++){
            
            int currBuy = Math.max(lastBuy , lastSold - prices[i]);
            int currSold = Math.max(lastSold , lastBuy + prices[i]);
            
            lastBuy = currBuy;
            lastSold = currSold;
            
        }
        
        return lastSold;
    }
}