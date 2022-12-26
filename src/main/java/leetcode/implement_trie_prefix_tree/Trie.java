package leetcode.implement_trie_prefix_tree;


/**
 * 208. 实现 Trie (前缀树)
 */
public class Trie {

	private final TrieNode root;

	/**
	 * 初始化前缀树对象。
	 */
	public Trie() {
		root = new TrieNode(' ');
	}

	/**
	 * 向前缀树中插入字符串 word 。
	 */
	public void insert(String word) {
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
	 * 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
	 */
	public boolean search(String word) {
		return search(false, word, root, 0);
	}

	private boolean search(boolean startsWith, String word, TrieNode node, int i) {
		if (i == word.length()) {
			if (startsWith) {
				return true;
			} else {
				return node.end;
			}
		}
		if (word.charAt(i) == '.') {
			for (int j = 0; j < 26; j++) {
				if (node.children[j] != null && search(startsWith, word, node.children[j], i + 1)) {
					return true;
				}
			}
		} else if (node.children[word.charAt(i) - 'a'] != null) {
			return search(startsWith, word, node.children[word.charAt(i) - 'a'], i + 1);
		}
		return false;
	}

	/**
	 * 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
	 */
	public boolean startsWith(String prefix) {
		return search(true, prefix, root, 0);
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
