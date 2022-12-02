package leetcode.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	@Test
	void isPalindrome() {
		Solution sol = new Solution();
		assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(sol.isPalindrome("race a car"));
	}
}