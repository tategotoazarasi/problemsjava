package leetcode.roman_to_integer;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends TestCase {

    @Test
    void romanToInt() {
        Solution sol = new Solution();
        Assertions.assertEquals(3, sol.romanToInt("III"));
        Assertions.assertEquals(4, sol.romanToInt("IV"));
        Assertions.assertEquals(9, sol.romanToInt("IX"));
        Assertions.assertEquals(58, sol.romanToInt("LVIII"));
        Assertions.assertEquals(1994, sol.romanToInt("MCMXCIV"));
    }
}