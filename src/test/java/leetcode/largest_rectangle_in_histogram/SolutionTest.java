package leetcode.largest_rectangle_in_histogram;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void largestRectangleArea1() {
		assertEquals(10, sol.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
	}

	@Test
	void largestRectangleArea2() {
		assertEquals(4, sol.largestRectangleArea(new int[]{2, 4}));
	}
}