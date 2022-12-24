package leetcode.graph_valid_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void validTree1() {
		Assertions.assertTrue(sol.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
	}

	@Test
	void validTree2() {
		Assertions.assertFalse(sol.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
	}
}