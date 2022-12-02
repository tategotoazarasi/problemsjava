package leetcode.maximum_number_of_words_found_in_sentences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void mostWordsFound() {
		Solution sol = new Solution();
		assertEquals(6,
		             sol.mostWordsFound(new String[]{"alice and bob love leetcode",
		                                             "i think so too",
		                                             "this is great thanks very much"}));
		assertEquals(3, sol.mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
	}
}