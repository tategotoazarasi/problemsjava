package leetcode.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	@Test
	void isValid() {
		Solution sol = new Solution();
		assertTrue(sol.isValid("()"));
		assertTrue(sol.isValid("()[]{}"));
		assertFalse(sol.isValid("(]"));
		assertFalse(sol.isValid("([)]"));
		assertTrue(sol.isValid("{[]}"));
		assertFalse(sol.isValid("("));
		assertFalse(sol.isValid(")"));
	}
}