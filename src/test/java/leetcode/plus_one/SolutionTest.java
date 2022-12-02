package leetcode.plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

	@Test
	void plusOne() {
		Solution sol = new Solution();
		assertArrayEquals(new int[]{1, 2, 4}, sol.plusOne(new int[]{1, 2, 3}));
		assertArrayEquals(new int[]{4, 3, 2, 2}, sol.plusOne(new int[]{4, 3, 2, 1}));
		assertArrayEquals(new int[]{1}, sol.plusOne(new int[]{0}));
		assertArrayEquals(new int[]{1, 0, 0, 0}, sol.plusOne(new int[]{9, 9, 9}));
	}
}