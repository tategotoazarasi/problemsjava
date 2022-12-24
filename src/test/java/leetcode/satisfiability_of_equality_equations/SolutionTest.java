package leetcode.satisfiability_of_equality_equations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void equationsPossible1() {
		Assertions.assertFalse(sol.equationsPossible(new String[]{"a==b", "b!=a"}));
	}

	@Test
	void equationsPossible2() {
		Assertions.assertTrue(sol.equationsPossible(new String[]{"b==a", "a==b"}));
	}

	@Test
	void equationsPossible3() {
		Assertions.assertTrue(sol.equationsPossible(new String[]{"a==b", "b==c", "a==c"}));
	}

	@Test
	void equationsPossible4() {
		Assertions.assertFalse(sol.equationsPossible(new String[]{"a==b", "b!=c", "c==a"}));
	}

	@Test
	void equationsPossible5() {
		Assertions.assertTrue(sol.equationsPossible(new String[]{"c==c", "b==d", "x!=z"}));
	}
}