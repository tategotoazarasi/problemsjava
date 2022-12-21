package leetcode.shortest_subarray_with_sum_at_least_k;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void shortestSubarray1() {
		assertEquals(1, sol.shortestSubarray(new int[]{1}, 1));
	}

	@Test
	void shortestSubarray2() {
		assertEquals(-1, sol.shortestSubarray(new int[]{1, 2}, 4));
	}

	@Test
	void shortestSubarray3() {
		assertEquals(3, sol.shortestSubarray(new int[]{2, -1, 2}, 3));
	}
}