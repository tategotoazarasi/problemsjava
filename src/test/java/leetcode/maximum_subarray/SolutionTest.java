package leetcode.maximum_subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void maxSubArray() {
		Solution sol = new Solution();
		assertEquals(6, sol.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
		assertEquals(1, sol.maxSubArray(new int[]{1}));
		assertEquals(23, sol.maxSubArray(new int[]{5, 4, -1, 7, 8}));
		assertEquals(-1, sol.maxSubArray(new int[]{-5, -4, -1, -7, -8}));
	}
}