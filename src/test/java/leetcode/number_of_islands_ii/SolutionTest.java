package leetcode.number_of_islands_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void numIslands21() {
		List<Integer> ans = new ArrayList<>();
		ans.add(1);
		ans.add(1);
		ans.add(2);
		ans.add(3);
		Assertions.assertEquals(ans, sol.numIslands2(3, 3, new int[][]{{0, 0}, {0, 1}, {1, 2}, {2, 1}}));
	}

	@Test
	void numIslands22() {
		List<Integer> ans = new LinkedList<>();
		ans.add(1);
		Assertions.assertEquals(ans, sol.numIslands2(1, 1, new int[][]{{0, 0}}));
	}
}