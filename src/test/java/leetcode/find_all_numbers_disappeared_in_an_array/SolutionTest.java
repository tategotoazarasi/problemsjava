package leetcode.find_all_numbers_disappeared_in_an_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void findDisappearedNumbers1() {
		int[]         nums = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> ans  = new ArrayList<>(List.of(new Integer[]{5, 6}));
		Assertions.assertEquals(ans, sol.findDisappearedNumbers(nums));
	}

	@Test
	void findDisappearedNumbers2() {
		int[]         nums = {1, 1};
		List<Integer> ans  = new ArrayList<>(List.of(new Integer[]{2}));
		Assertions.assertEquals(ans, sol.findDisappearedNumbers(nums));
	}
}