package leetcode.climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void climbStairs() {
        Solution sol = new Solution();
        assertEquals(2, sol.climbStairs(2));
        assertEquals(3, sol.climbStairs(3));
        assertEquals(5, sol.climbStairs(4));
    }
}