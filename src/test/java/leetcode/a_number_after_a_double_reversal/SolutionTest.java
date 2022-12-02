package leetcode.a_number_after_a_double_reversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	@Test
	void isSameAfterReversals() {
		Solution sol = new Solution();
		assertTrue(sol.isSameAfterReversals(526));
		assertFalse(sol.isSameAfterReversals(1800));
		assertTrue(sol.isSameAfterReversals(0));
	}
}