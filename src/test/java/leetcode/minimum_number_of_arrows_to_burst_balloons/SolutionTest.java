package leetcode.minimum_number_of_arrows_to_burst_balloons;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void findMinArrowShots1() {
		int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
		assertEquals(2, sol.findMinArrowShots(points));
	}

	@Test
	void findMinArrowShots2() {
		int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
		assertEquals(4, sol.findMinArrowShots(points));
	}

	@Test
	void findMinArrowShots3() {
		int[][] points = {{2, 3}, {2, 3}, {3, 4}, {4, 5}};
		assertEquals(2, sol.findMinArrowShots(points));
	}
}