package leetcode.palindrome_pairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void palindromePairs1() {
		Set<List<Integer>>
				ans =
				Set.of(Arrays.asList(0, 1), Arrays.asList(1, 0), Arrays.asList(3, 2), Arrays.asList(2, 4));
		List<List<Integer>> res = sol.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
		Assertions.assertEquals(res.size(), ans.size());
		for (List<Integer> p : res) {
			Assertions.assertTrue(ans.contains(p));
		}
	}

	@Test
	void palindromePairs2() {
		Set<List<Integer>>
				ans =
				Set.of(Arrays.asList(0, 1), Arrays.asList(1, 0));
		List<List<Integer>> res = sol.palindromePairs(new String[]{"bat", "tab", "cat"});
		Assertions.assertEquals(res.size(), ans.size());
		for (List<Integer> p : res) {
			Assertions.assertTrue(ans.contains(p));
		}
	}

	@Test
	void palindromePairs3() {
		Set<List<Integer>>
				ans =
				Set.of(Arrays.asList(0, 1), Arrays.asList(1, 0));
		List<List<Integer>> res = sol.palindromePairs(new String[]{"a", ""});
		Assertions.assertEquals(res.size(), ans.size());
		for (List<Integer> p : res) {
			Assertions.assertTrue(ans.contains(p));
		}
	}
}