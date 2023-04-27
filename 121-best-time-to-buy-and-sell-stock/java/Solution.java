class Solution {
    public int maxProfit(int[] prices) {
        int boughtDay = prices[0];
        int profit = 0;
        int current_profit = 0;
        for(int i = 0; i < prices.length ; i++)
        {
            if(prices[i] < boughtDay)
            {
                boughtDay = prices[i];
            }
            
            current_profit = prices[i] - boughtDay;
            
            if(profit < current_profit)
            {
                profit = current_profit;
            }
        }
        
        return profit;
    }
}