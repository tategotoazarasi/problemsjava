package leetcode.single_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void singleNumber() {
		Solution sol = new Solution();
		assertEquals(1, sol.singleNumber(new int[]{2, 2, 1}));
		assertEquals(4, sol.singleNumber(new int[]{4, 1, 2, 1, 2}));
	}
}