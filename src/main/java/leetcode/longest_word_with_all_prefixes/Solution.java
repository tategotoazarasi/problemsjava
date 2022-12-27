package leetcode.longest_word_with_all_prefixes;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1858. 包含所有前缀的最长单词
 */
public class Solution {
	public String longestWord(String[] words) {
		Trie t = new Trie(' ');
		for (String word : words) {
			t.insert(word);
		}
		Queue<Trie> q = new LinkedList<>();
		q.add(t);
		Trie ans = null;
		while (!q.isEmpty()) {
			Trie trie = q.poll();
			ans = trie;
			for (int i = 25; i >= 0; i--) {
				if (trie.children[i] != null && trie.children[i].end) {
					q.add(trie.children[i]);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		while (ans != null & ans != t) {
			sb.append(ans.ch);
			ans = ans.parent;
		}
		sb = sb.reverse();
		return sb.toString();
	}

	private class Trie {
		public char    ch;
		public Trie    parent;
		public boolean end = false;
		public Trie[]  children;

		public Trie(char ch) {
			this.ch  = ch;
			children = new Trie[26];
		}

		public void insert(String str) {
			insert(str, 0);
		}

		private void insert(String str, int i) {
			if (i == str.length()) {
				this.end = true;
				return;
			}
			if (children[str.charAt(i) - 'a'] == null) {
				children[str.charAt(i) - 'a']        = new Trie(str.charAt(i));
				children[str.charAt(i) - 'a'].parent = this;
			}
			children[str.charAt(i) - 'a'].insert(str, i + 1);
		}
	}
}