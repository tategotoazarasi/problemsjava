package leetcode.possible_bipartition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void possibleBipartition1() {
		Assertions.assertTrue(sol.possibleBipartition(4, new int[][]{{1, 2}, {1, 3}, {2, 4}}));
	}

	@Test
	void possibleBipartition2() {
		Assertions.assertFalse(sol.possibleBipartition(3, new int[][]{{1, 2}, {1, 3}, {2, 3}}));
	}

	@Test
	void possibleBipartition3() {
		Assertions.assertFalse(sol.possibleBipartition(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}));
	}
}