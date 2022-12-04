package leetcode.perform_string_shifts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void stringShift1() {
		int[][] shift = {{0, 1}, {1, 2}};
		assertEquals("cab", sol.stringShift("abc", shift));
	}

	@Test
	void stringShift2() {
		int[][] shift = {{1, 1}, {1, 1}, {0, 2}, {1, 3}};
		assertEquals("efgabcd", sol.stringShift("abcdefg", shift));
	}
}