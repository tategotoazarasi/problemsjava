package problems.implement_strstr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void strStr() {
        Solution sol = new Solution();
        assertEquals(2, sol.strStr("hello", "ll"));
        assertEquals(-1, sol.strStr("aaaaa", "bba"));
        assertEquals(0, sol.strStr("", ""));
    }
}