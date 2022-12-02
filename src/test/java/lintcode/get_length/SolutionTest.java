package lintcode.get_length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void getLength() {
		Solution sol = new Solution();
		assertEquals(5, sol.getLength("he llo"));
		assertEquals(13, sol.getLength("Good luck, boy."));
	}
}