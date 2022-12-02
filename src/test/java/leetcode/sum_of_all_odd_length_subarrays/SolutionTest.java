package leetcode.sum_of_all_odd_length_subarrays;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void sumOddLengthSubarrays1() {
		int[] arr = {1, 4, 2, 5, 3};
		assertEquals(58, sol.sumOddLengthSubarrays(arr));
	}

	@Test
	void sumOddLengthSubarrays2() {
		int[] arr = {1, 2};
		assertEquals(3, sol.sumOddLengthSubarrays(arr));
	}

	@Test
	void sumOddLengthSubarrays3() {
		int[] arr = {10, 11, 12};
		assertEquals(66, sol.sumOddLengthSubarrays(arr));
	}

	@Test
	void sumOddLengthSubarrays4() {
		int[] arr = {7, 6, 8, 6};
		assertEquals(68, sol.sumOddLengthSubarrays(arr));
	}
}