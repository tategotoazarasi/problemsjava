package leetcode.sqrtx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void mySqrt() {
        Solution sol = new Solution();
        assertEquals(2, sol.mySqrt(4));
        assertEquals(2, sol.mySqrt(8));
        assertEquals(46339, sol.mySqrt(2147395599));
        assertEquals(46340, sol.mySqrt(2147483647));
    }
}