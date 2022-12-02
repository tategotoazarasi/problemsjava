package leetcode.reverse_integer;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends TestCase {

	@Test
	void reverse() {
		Solution sol = new Solution();
		Assertions.assertEquals(321, sol.reverse(123));
		Assertions.assertEquals(-321, sol.reverse(-123));
		Assertions.assertEquals(21, sol.reverse(120));
		Assertions.assertEquals(0, sol.reverse(0));
		Assertions.assertEquals(0, sol.reverse(2000000007));
	}
}