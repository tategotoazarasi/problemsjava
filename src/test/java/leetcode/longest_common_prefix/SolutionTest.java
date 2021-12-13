package leetcode.longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        Solution sol = new Solution();
        assertEquals(sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        assertEquals(sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
        assertEquals(sol.longestCommonPrefix(new String[]{"", "racecar", "car"}), "");
        assertEquals(sol.longestCommonPrefix(new String[]{"dwad", "", "car"}), "");
        assertEquals(sol.longestCommonPrefix(new String[]{"dwad", "w", "car"}), "");
        assertEquals(sol.longestCommonPrefix(new String[]{"a"}), "a");
        assertEquals(sol.longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}), "flower");
    }
}