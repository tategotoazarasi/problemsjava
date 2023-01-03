package leetcode.word_ladder;

import java.util.*;

/**
 * 127. 单词接龙
 */
public class Solution {
	private final Map<String, Node> nodes = new HashMap<>();
	private       String            endWord;
	private final Map<String, Integer> diffEndMap = new HashMap<>();

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		this.endWord = endWord;
		for (String word : wordList) {
			nodes.put(word, new Node(word));
		}
		if (!nodes.containsKey(endWord)) {
			return 0;
		}
		for (int i = 0; i < wordList.size(); i++) {
			String wordI = wordList.get(i);
			for (int j = 1; j < wordList.size(); j++) {
				String wordJ = wordList.get(j);
				if (diff(wordI, wordJ) == 1) {
					nodes.get(wordI).siblings.add(nodes.get(wordJ));
					nodes.get(wordJ).siblings.add(nodes.get(wordI));
				}
			}
		}
		if (!nodes.containsKey(beginWord)) {
			nodes.put(beginWord, new Node(beginWord));
			for (String word : wordList) {
				if (diff(beginWord, word) == 1) {
					nodes.get(word).siblings.add(nodes.get(beginWord));
					nodes.get(beginWord).siblings.add(nodes.get(word));
				}
			}
		}
		PriorityQueue<Frame>
				pq =
				new PriorityQueue<>((o1, o2) -> Integer.compare(o1.len + diffEnd(o1.node.word),
				                                                o2.len + diffEnd(o2.node.word)));
		pq.add(new Frame(1, nodes.get(beginWord)));
		while (!pq.isEmpty()) {
			Frame f = pq.poll();
			if (f.node.word.equals(endWord)) {
				return f.len;
			}
			if (f.len + diffEnd(f.node.word) > wordList.size()) {
				return 0;
			}
			for (Node next : f.node.siblings) {
				pq.add(new Frame(f.len + 1, next));
			}
		}
		return 0;
	}

	private int diff(String w1, String w2) {
		assert (w1.length() == w2.length());
		int ans = 0;
		for (int i = 0; i < w1.length(); i++) {
			if (w1.charAt(i) != w2.charAt(i)) {
				ans++;
			}
		}
		return ans;
	}

	private int diffEnd(String word) {
		if (diffEndMap.containsKey(word)) {
			return diffEndMap.get(word);
		} else {
			int diffValue = diff(word, endWord);
			diffEndMap.put(word, diffValue);
			return diffValue;
		}
	}

	private class Node {
		public String    word;
		public Set<Node> siblings;

		public Node(String word) {
			this.word = word;
			siblings  = new HashSet<>();
		}
	}

	private class Frame {
		public int  len;
		public Node node;

		public Frame(int len, Node node) {
			this.len  = len;
			this.node = node;
		}
	}
}