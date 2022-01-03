package leetcode.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxProfit() {
        Solution sol = new Solution();
        assertEquals(5, sol.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, sol.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}