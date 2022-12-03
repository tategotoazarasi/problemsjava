package leetcode.leetcode_4sum_ii;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void fourSumCount1() {
		int[] nums1 = {1, 2};
		int[] nums2 = {-2, -1};
		int[] nums3   = {-1, 2};
		int[] nums4   = {0, 2};
		assertEquals(2, sol.fourSumCount(nums1, nums2, nums3, nums4));
	}

	@Test
	void fourSumCount2() {
		int[] nums1 = {0};
		int[] nums2 = {0};
		int[] nums3   = {0};
		int[] nums4   = {0};
		assertEquals(1, sol.fourSumCount(nums1, nums2, nums3, nums4));
	}
}