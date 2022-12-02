package leetcode.longest_palindrome_by_concatenating_two_letter_words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void longestPalindrome() {
		Solution sol = new Solution();
		assertEquals(6, sol.longestPalindrome(new String[]{"lc", "cl", "gg"}));
		assertEquals(8, sol.longestPalindrome(new String[]{"ab", "ty", "yt", "lc", "cl", "ab"}));
		assertEquals(2, sol.longestPalindrome(new String[]{"cc", "ll", "xx"}));
		assertEquals(22,
		             sol.longestPalindrome(new String[]{"dd",
		                                                "aa",
		                                                "bb",
		                                                "dd",
		                                                "aa",
		                                                "dd",
		                                                "bb",
		                                                "dd",
		                                                "aa",
		                                                "cc",
		                                                "bb",
		                                                "cc",
		                                                "dd",
		                                                "cc"}));
		assertEquals(30,
		             sol.longestPalindrome(new String[]{"mm",
		                                                "mm",
		                                                "yb",
		                                                "by",
		                                                "bb",
		                                                "bm",
		                                                "ym",
		                                                "mb",
		                                                "yb",
		                                                "by",
		                                                "mb",
		                                                "mb",
		                                                "bb",
		                                                "yb",
		                                                "by",
		                                                "bb",
		                                                "yb",
		                                                "my",
		                                                "mb",
		                                                "ym"}));
	}
}