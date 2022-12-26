package leetcode.design_add_and_search_words_data_structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordDictionaryTest {

	@Test
	void test1() {
		WordDictionary wd = new WordDictionary();
		wd.addWord("at");
		wd.addWord("and");
		wd.addWord("an");
		wd.addWord("add");
		Assertions.assertFalse(wd.search("a"));
	}
}