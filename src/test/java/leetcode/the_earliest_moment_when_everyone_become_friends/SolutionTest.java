package leetcode.the_earliest_moment_when_everyone_become_friends;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void earliestAcq1() {
		Assertions.assertEquals(20190301, sol.earliestAcq(new int[][]{{20190101, 0, 1},
		                                                              {20190104, 3, 4},
		                                                              {20190107, 2, 3},
		                                                              {20190211, 1, 5},
		                                                              {20190224, 2, 4},
		                                                              {20190301, 0, 3},
		                                                              {20190312, 1, 2},
		                                                              {20190322, 4, 5}}, 6));
	}

	@Test
	void earliestAcq2() {
		Assertions.assertEquals(3,
		                        sol.earliestAcq(new int[][]{{0, 2, 0}, {1, 0, 1}, {3, 0, 3}, {4, 1, 2}, {7, 3, 1}}, 4));
	}
}