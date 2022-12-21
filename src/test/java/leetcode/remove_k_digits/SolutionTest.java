package leetcode.remove_k_digits;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void removeKdigits1() {
		assertEquals("1219", sol.removeKdigits("1432219", 3));
	}

	@Test
	void removeKdigits2() {
		assertEquals("200", sol.removeKdigits("10200", 1));
	}

	@Test
	void removeKdigits3() {
		assertEquals("0", sol.removeKdigits("10", 2));
	}

	@Test
	void removeKdigits4() {
		assertEquals("0", sol.removeKdigits("9", 1));
	}

	@Test
	void removeKdigits5() {
		assertEquals("0", sol.removeKdigits("1234567890", 9));
	}
}