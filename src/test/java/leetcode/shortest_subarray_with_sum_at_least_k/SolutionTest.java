package leetcode.shortest_subarray_with_sum_at_least_k;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void shortestSubarray1() {
		Assertions.assertEquals(1, sol.shortestSubarray(new int[]{1}, 1));
	}

	@Test
	void shortestSubarray2() {
		Assertions.assertEquals(-1, sol.shortestSubarray(new int[]{1, 2}, 4));
	}

	@Test
	void shortestSubarray3() {
		Assertions.assertEquals(3, sol.shortestSubarray(new int[]{2, -1, 2}, 3));
	}
}