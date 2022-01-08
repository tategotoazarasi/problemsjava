package leetcode.capitalize_the_title;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void capitalizeTitle() {
        Solution sol = new Solution();
        assertEquals("Capitalize The Title", sol.capitalizeTitle("capiTalIze tHe titLe"));
        assertEquals("First Letter of Each Word", sol.capitalizeTitle("First leTTeR of EACH Word"));
        assertEquals("i Love Leetcode", sol.capitalizeTitle("i Love Leetcode"));
    }
}