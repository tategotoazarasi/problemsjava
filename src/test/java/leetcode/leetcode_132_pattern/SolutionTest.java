package leetcode.leetcode_132_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void find132pattern1() {
		assertFalse(sol.find132pattern(new int[]{1, 2, 3, 4}));
	}

	@Test
	void find132pattern2() {
		assertTrue(sol.find132pattern(new int[]{3, 1, 4, 2}));
	}

	@Test
	void find132pattern3() {
		assertTrue(sol.find132pattern(new int[]{-1, 3, 2, 0}));
	}

	@Test
	void find132pattern4() {
		assertTrue(sol.find132pattern(new int[]{1, 3, 2, 4, 5, 6, 7, 8, 9, 10}));
	}

	@Test
	void find132pattern5() {
		assertTrue(sol.find132pattern(new int[]{1, 4, 0, -1, -2, -3, -1, -2}));
	}
}