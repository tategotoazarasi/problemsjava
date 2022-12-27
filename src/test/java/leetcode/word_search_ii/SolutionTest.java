package leetcode.word_search_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void findWords1() {
		Assertions.assertEquals(Arrays.asList("oath", "eat"),
		                        sol.findWords(new char[][]{{'o', 'a', 'a', 'n'},
		                                                   {'e', 't', 'a', 'e'},
		                                                   {'i', 'h', 'k', 'r'},
		                                                   {'i', 'f', 'l', 'v'}},
		                                      new String[]{"oath", "pea", "eat", "rain"}));
	}

	@Test
	void findWords2() {
		Assertions.assertEquals(new ArrayList<>(),
		                        sol.findWords(new char[][]{{'a', 'b'},
		                                                   {'c', 'd'}},
		                                      new String[]{"abcd"}));
	}

	@Test
	void findWords3() {
		Assertions.assertEquals(Arrays.asList("oa", "oaa"),
		                        sol.findWords(new char[][]{{'o', 'a', 'b', 'n'},
		                                                   {'o', 't', 'a', 'e'},
		                                                   {'a', 'h', 'k', 'r'},
		                                                   {'a', 'f', 'l', 'v'}},
		                                      new String[]{"oa", "oaa"}));
	}

	@Test
	void findWords4() {
		Assertions.assertEquals(new ArrayList<>(),
		                        sol.findWords(new char[][]{{'a', 'a'}},
		                                      new String[]{"aaa"}));
	}

	@Test
	void findWords5() {
		Assertions.assertEquals(Arrays.asList("aaa", "aba", "aaba", "baa", "aaab"),
		                        sol.findWords(new char[][]{{'a', 'b'}, {'a', 'a'}},
		                                      new String[]{"aba", "baa", "bab", "aaab", "aaa", "aaaa", "aaba"}));
	}
}