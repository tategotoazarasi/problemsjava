package leetcode.wildcard_matching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void isMatch1() {
		Assertions.assertFalse(sol.isMatch("aa", "a"));
	}

	@Test
	void isMatch2() {
		Assertions.assertTrue(sol.isMatch("aa", "*"));
	}

	@Test
	void isMatch3() {
		Assertions.assertFalse(sol.isMatch("cb", "?a"));
	}

	@Test
	void isMatch4() {
		Assertions.assertTrue(sol.isMatch("adceb", "*a*b"));
	}

	@Test
	void isMatch5() {
		Assertions.assertFalse(sol.isMatch("acdcb", "a*c?b"));
	}

	@Test
	void isMatch6() {
		Assertions.assertTrue(sol.isMatch("", "******"));
	}

	@Test
	void isMatch7() {
		Assertions.assertTrue(sol.isMatch("abbaaaabbbbbababbbbbbbbaaabaabbabaabbaaabbbbabbbbab",
		                                  "a*aaba***b**a*a********b"));
	}

	@Test
	void isMatch8() {
		Assertions.assertTrue(sol.isMatch(
				"abbaabbbbababaababababbabbbaaaabbbbaaabbbabaabbbbbabbbbabbabbaaabaaaabbbbbbaaabbabbbbababbbaaabbabbabb",
				"***b**a*a*b***b*a*b*bbb**baa*bba**b**bb***b*a*aab*a**"));
	}

	@Test
	void isMatch9() {
		Assertions.assertFalse(sol.isMatch(
				"aab",
				"c*a*b"));
	}

	@Test
	void isMatch10() {
		Assertions.assertFalse(sol.isMatch(
				"mississippi",
				"m??*ss*?i*pi"));
	}
}