package leetcode.longest_consecutive_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void longestConsecutive1() {
		int[] nums = {100, 4, 200, 1, 3, 2};
		assertEquals(4, sol.longestConsecutive(nums));
	}

	@Test
	void longestConsecutive2() {
		int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
		assertEquals(9, sol.longestConsecutive(nums));
	}
}