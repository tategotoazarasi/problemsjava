package leetcode.remove_max_number_of_edges_to_keep_graph_fully_traversable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void maxNumEdgesToRemove1() {
		Assertions.assertEquals(2, sol.maxNumEdgesToRemove(4,
		                                                   new int[][]{{3, 1, 2},
		                                                               {3, 2, 3},
		                                                               {1, 1, 3},
		                                                               {1, 2, 4},
		                                                               {1, 1, 2},
		                                                               {2, 3, 4}}));
	}

	@Test
	void maxNumEdgesToRemove2() {
		Assertions.assertEquals(0, sol.maxNumEdgesToRemove(4,
		                                                   new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}}));
	}

	@Test
	void maxNumEdgesToRemove3() {
		Assertions.assertEquals(-1, sol.maxNumEdgesToRemove(4,
		                                                    new int[][]{{3, 2, 3}, {1, 1, 2}, {2, 3, 4}}));
	}

	@Test
	void maxNumEdgesToRemove4() {
		Assertions.assertEquals(48, sol.maxNumEdgesToRemove(8,
		                                                    new int[][]{{1, 1, 2},
		                                                                {2, 1, 2},
		                                                                {1, 2, 3},
		                                                                {2, 2, 3},
		                                                                {3, 2, 4},
		                                                                {1, 2, 5},
		                                                                {2, 2, 5},
		                                                                {1, 4, 6},
		                                                                {2, 4, 6},
		                                                                {1, 6, 7},
		                                                                {2, 6, 7},
		                                                                {1, 1, 8},
		                                                                {2, 1, 8},
		                                                                {2, 1, 6},
		                                                                {3, 1, 7},
		                                                                {3, 2, 6},
		                                                                {1, 5, 6},
		                                                                {2, 3, 5},
		                                                                {2, 1, 7},
		                                                                {2, 5, 7},
		                                                                {2, 5, 6},
		                                                                {2, 2, 4},
		                                                                {3, 3, 8},
		                                                                {3, 2, 5},
		                                                                {2, 2, 6},
		                                                                {1, 4, 7},
		                                                                {3, 4, 8},
		                                                                {2, 4, 7},
		                                                                {1, 1, 7},
		                                                                {2, 6, 8},
		                                                                {1, 7, 8},
		                                                                {2, 5, 8},
		                                                                {2, 2, 8},
		                                                                {1, 2, 6},
		                                                                {2, 3, 6},
		                                                                {3, 3, 6},
		                                                                {3, 5, 8},
		                                                                {2, 2, 7},
		                                                                {3, 7, 8},
		                                                                {3, 1, 6},
		                                                                {3, 3, 4},
		                                                                {3, 1, 8},
		                                                                {3, 4, 7},
		                                                                {3, 1, 3},
		                                                                {2, 1, 4},
		                                                                {3, 2, 3},
		                                                                {1, 6, 8},
		                                                                {1, 3, 7},
		                                                                {3, 6, 7},
		                                                                {1, 1, 3},
		                                                                {1, 1, 4},
		                                                                {2, 1, 5},
		                                                                {1, 3, 6},
		                                                                {3, 5, 7},
		                                                                {3, 2, 7}}));
	}
}