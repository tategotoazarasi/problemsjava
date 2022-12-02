package leetcode.add_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void addBinary() {
		Solution sol = new Solution();
		assertEquals("100", sol.addBinary("11", "1"));
		assertEquals("10101", sol.addBinary("1010", "1011"));
	}
}