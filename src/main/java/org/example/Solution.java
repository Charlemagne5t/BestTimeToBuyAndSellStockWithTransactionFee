package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxProfit(int[] prices, int fee) {
        Map<String, Integer> memo = new HashMap<>();
        return (prices, 0, fee, memo, true);

    }

    //!ableToBuy == ableToSell
    private int dfs(int[] prices, int index, int fee, Map<String, Integer> memo, boolean ableToBuy) {
        if (index >= prices.length) {
            return 0;
        }

        if (memo.containsKey(index + " " + ableToBuy)) {
            return memo.get(index + " " + ableToBuy);
        }
        if (ableToBuy) {
            int buy = dfs(prices, index + 1, fee, memo, false) - prices[index];
            int skip = dfs(prices, index + 1, fee, memo, true);
            memo.put(index + " " + ableToBuy, Math.max(buy, skip));
        }
        if (!ableToBuy) {
            int sell = dfs(prices, index + 1, fee, memo, true) + prices[index] - fee;
            int skip = dfs(prices, index + 1, fee, memo, false);
            memo.put(index + " " + ableToBuy, Math.max(sell, skip));
        }
        return memo.get(index + " " + ableToBuy);
    }
}
