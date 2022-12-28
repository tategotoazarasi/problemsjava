package leetcode.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典树
 */
public class Trie {
	public char                 ch;
	public boolean              end = false;
	public Map<Character, Trie> children;

	public Trie(char ch) {
		this.ch  = ch;
		children = new HashMap<>();
	}

	public void insert(String str) {
		insert(str, 0);
	}

	private void insert(String str, int i) {
		if (i == str.length()) {
			this.end = true;
			return;
		}
		if (children.get(str.charAt(i)) == null) {
			children.put(str.charAt(i), new Trie(str.charAt(i)));
		}
		children.get(str.charAt(i)).insert(str, i + 1);
	}

	public boolean search(String word) {
		Trie current = this;
		int  i       = 0;
		while (i < word.length() && current.children.containsKey(word.charAt(i))) {
			current = current.children.get(word.charAt(i));
			i++;
		}
		return i == word.length() && current.end;
	}
}
