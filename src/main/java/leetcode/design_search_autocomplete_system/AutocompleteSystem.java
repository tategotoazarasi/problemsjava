package leetcode.design_search_autocomplete_system;

import java.util.ArrayList;
import java.util.List;

/**
 * 642. 设计搜索自动补全系统
 */
public class AutocompleteSystem {
	Trie   root;
	String curSent = "";

	/**
	 * 使用数组sentences 和 times 对对象进行初始化。
	 */
	public AutocompleteSystem(String[] sentences, int[] times) {
		root = new Trie();
		for (int i = 0; i < sentences.length; i++) {
			insert(root, sentences[i], times[i]);
		}
	}

	public void insert(Trie t, String s, int times) {
		for (int i = 0; i < s.length(); i++) {
			if (t.branches[c2i(s.charAt(i))] == null) {t.branches[c2i(s.charAt(i))] = new Trie();}
			t = t.branches[c2i(s.charAt(i))];
		}
		t.times += times;
	}

	public static int c2i(char c) {
		return c == ' ' ? 26 : c - 'a';
	}

	public List<Node> lookup(Trie t, String s) {
		List<Node> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (t.branches[c2i(s.charAt(i))] == null) {return new ArrayList<>();}
			t = t.branches[c2i(s.charAt(i))];
		}
		traverse(s, t, list);
		return list;
	}

	public void traverse(String s, Trie t, List<Node> list) {
		if (t.times > 0) {list.add(new Node(s, t.times));}
		for (char i = 'a'; i <= 'z'; i++) {
			if (t.branches[i - 'a'] != null) {traverse(s + i, t.branches[i - 'a'], list);}
		}
		if (t.branches[26] != null) {traverse(s + ' ', t.branches[26], list);}
	}

	/**
	 * 表示用户输入了字符 c 。
	 *
	 * @return 如果 c == '#' ，则返回空数组 [] ，并将输入的语句存储在系统中。否则返回前 3 个历史热门句子，这些句子的前缀与已经输入的句子的部分相同。如果少于 3 个匹配项，则全部返回。
	 */
	public List<String> input(char c) {
		List<String> res = new ArrayList<>();
		if (c == '#') {
			insert(root, curSent, 1);
			curSent = "";
		} else {
			curSent += c;
			List<Node> list = lookup(root, curSent);
			list.sort((a, b) -> a.times == b.times ? a.sentence.compareTo(b.sentence) : b.times - a.times);
			for (int i = 0; i < Math.min(3, list.size()); i++) {res.add(list.get(i).sentence);}
		}
		return res;
	}

	static class Node {
		String sentence;
		int    times;

		Node(String st, int t) {
			sentence = st;
			times    = t;
		}
	}

	static class Trie {
		int    times;
		Trie[] branches = new Trie[27];
	}
}