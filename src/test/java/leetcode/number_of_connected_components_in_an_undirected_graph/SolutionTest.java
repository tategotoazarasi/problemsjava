package leetcode.number_of_connected_components_in_an_undirected_graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void countComponents1() {
		Assertions.assertEquals(2, sol.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
	}

	@Test
	void countComponents2() {
		Assertions.assertEquals(1, sol.countComponents(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}));
	}
}