/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {

    let profit = 0
    let buy = prices[0]

    for(let i = 1 ; i < prices.length ; i++){

        buy = Math.min(prices[i], buy)
        profit = Math.max(prices[i] - buy , profit)
    }

    return profit
};