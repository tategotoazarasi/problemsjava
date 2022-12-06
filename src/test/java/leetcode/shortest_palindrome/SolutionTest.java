package leetcode.shortest_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void shortestPalindrome1() {
		assertEquals("aaacecaaa", sol.shortestPalindrome("aacecaaa"));
	}

	@Test
	void shortestPalindrome2() {
		assertEquals("dcbabcd", sol.shortestPalindrome("abcd"));
	}

	@Test
	void shortestPalindrome3() {
		assertEquals("aba", sol.shortestPalindrome("aba"));
	}

	@Test
	void shortestPalindrome4() {
		assertEquals("dcabbacd", sol.shortestPalindrome("abbacd"));
	}

	@Test
	void shortestPalindrome5() {
		assertEquals("dcabbacd", sol.shortestPalindrome("abbacd"));
	}

	@Test
	void shortestPalindrome6() {
		assertEquals("efbabababababfe", sol.shortestPalindrome("abababababfe"));
	}
}