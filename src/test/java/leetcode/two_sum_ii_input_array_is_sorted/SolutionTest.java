package leetcode.two_sum_ii_input_array_is_sorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

	@Test
	void twoSum() {
		Solution sol = new Solution();
		assertArrayEquals(new int[]{1, 2}, sol.twoSum(new int[]{2, 7, 11, 15}, 9));
		assertArrayEquals(new int[]{1, 3}, sol.twoSum(new int[]{2, 3, 4}, 6));
		assertArrayEquals(new int[]{1, 2}, sol.twoSum(new int[]{-1, 0}, -1));
	}
}