package leetcode.design_add_and_search_words_data_structure;

/**
 * 211. 添加与搜索单词 - 数据结构设计
 */
public class WordDictionary {
	private final TrieNode root;

	/**
	 * 初始化词典对象
	 */
	public WordDictionary() {
		root = new TrieNode(' ');
	}

	/**
	 * 将 word 添加到数据结构中，之后可以对它进行匹配
	 */
	public void addWord(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			if (current.children[word.charAt(i) - 'a'] == null) {
				current.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
			}
			current = current.children[word.charAt(i) - 'a'];
			if (i == word.length() - 1) {
				current.end = true;
			}
		}
	}

	/**
	 * 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回  false 。word 中可能包含一些 '.' ，每个 . 都可以表示任何一个字母。
	 */
	public boolean search(String word) {
		return search(word, root, 0);
	}

	private boolean search(String word, TrieNode node, int i) {
		if (i == word.length()) {
			return node.end;
		}
		if (word.charAt(i) == '.') {
			for (int j = 0; j < 26; j++) {
				if (node.children[j] != null && search(word, node.children[j], i + 1)) {
					return true;
				}
			}
		} else if (node.children[word.charAt(i) - 'a'] != null) {
			return search(word, node.children[word.charAt(i) - 'a'], i + 1);
		}
		return false;
	}

	private class TrieNode {
		public char       c;
		public TrieNode[] children;
		public boolean    end = false;

		public TrieNode(char c) {
			this.c   = c;
			children = new TrieNode[26];
		}
	}
}