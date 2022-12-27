package leetcode.longest_word_with_all_prefixes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void longestWord1() {
		Assertions.assertEquals("kiran", sol.longestWord(new String[]{"k", "ki", "kir", "kira", "kiran"}));
	}

	@Test
	void longestWord2() {
		Assertions.assertEquals("apple",
		                        sol.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
	}

	@Test
	void longestWord3() {
		Assertions.assertEquals("", sol.longestWord(new String[]{"abc", "bc", "ab", "qwe"}));
	}
}