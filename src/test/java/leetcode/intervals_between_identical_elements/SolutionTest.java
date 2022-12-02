package leetcode.intervals_between_identical_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

	@Test
	void getDistances() {
		Solution sol = new Solution();

		assertArrayEquals(new long[]{4, 2, 7, 2, 4, 4, 5}, sol.getDistances(new int[]{2, 1, 3, 1, 2, 3, 3}));
		assertArrayEquals(new long[]{5, 0, 3, 4}, sol.getDistances(new int[]{10, 5, 10, 10}));
	}
}