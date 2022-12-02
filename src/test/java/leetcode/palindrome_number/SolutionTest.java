package leetcode.palindrome_number;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends TestCase {

	@Test
	void isPalindrome() {
		Solution sol = new Solution();
		Assertions.assertTrue(sol.isPalindrome(121));
		Assertions.assertTrue(sol.isPalindrome(12321));
		Assertions.assertFalse(sol.isPalindrome(17321));
		Assertions.assertFalse(sol.isPalindrome(14567));
		Assertions.assertFalse(sol.isPalindrome(-10));
		Assertions.assertFalse(sol.isPalindrome(-121));
		Assertions.assertFalse(sol.isPalindrome(-101));
	}
}