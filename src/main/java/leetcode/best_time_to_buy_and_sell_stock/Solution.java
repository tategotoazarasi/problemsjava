package leetcode.best_time_to_buy_and_sell_stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int[] rev_max = new int[prices.length];
        int max = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (max < prices[i]) {
                max = prices[i];
            }
            rev_max[i] = max;
        }
        max = 0;
        for (int i = 0; i < prices.length; i++) {
            int diff = rev_max[i] - prices[i];
            if (max < diff) {
                max = diff;
            }
        }
        return max;
    }
}