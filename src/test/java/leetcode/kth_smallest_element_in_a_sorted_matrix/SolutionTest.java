package leetcode.kth_smallest_element_in_a_sorted_matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void kthSmallest1() {
		Assertions.assertEquals(13, sol.kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
	}

	@Test
	void kthSmallest2() {
		Assertions.assertEquals(-5, sol.kthSmallest(new int[][]{{-5}}, 1));
	}

	@Test
	void kthSmallest3() {
		Assertions.assertEquals(11, sol.kthSmallest(new int[][]{{1, 3, 5}, {6, 7, 12}, {11, 14, 14}}, 6));
	}
}