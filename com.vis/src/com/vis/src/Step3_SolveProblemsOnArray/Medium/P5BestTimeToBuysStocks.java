package com.vis.src.Step3_SolveProblemsOnArray.Medium;

public class P5BestTimeToBuysStocks {
    /**
     * Before I used Suffix Max and Traversed from right to left that tracks buy on i and sell on max val.
     * But here, we can traverse the sell on i and buy the minimum before (0 to i-1)
     * Hence DP played nice here ;)
     * */
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // DP Because Remembering the Pervious Min Ele.
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;

    }
}
