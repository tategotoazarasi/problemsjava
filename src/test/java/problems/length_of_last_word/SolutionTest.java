package problems.length_of_last_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void lengthOfLastWord() {
        Solution sol = new Solution();
        assertEquals(5, sol.lengthOfLastWord("Hello World"));
        assertEquals(4, sol.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, sol.lengthOfLastWord("luffy is still joyboy"));
        assertEquals(1, sol.lengthOfLastWord("s"));
    }
}