package leetcode.word_ladder;

import java.util.*;

/**
 * 127. 单词接龙
 */
public class Solution {
	Map<String, Integer> wordId  = new HashMap<>();
	List<List<Integer>>  edge    = new ArrayList<>();
	int                  nodeNum = 0;

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		for (String word : wordList) {
			addEdge(word);
		}
		addEdge(beginWord);
		if (!wordId.containsKey(endWord)) {
			return 0;
		}

		int[] disBegin = new int[nodeNum];
		Arrays.fill(disBegin, Integer.MAX_VALUE);
		int beginId = wordId.get(beginWord);
		disBegin[beginId] = 0;
		Queue<Integer> queBegin = new LinkedList<>();
		queBegin.offer(beginId);

		int[] disEnd = new int[nodeNum];
		Arrays.fill(disEnd, Integer.MAX_VALUE);
		int endId = wordId.get(endWord);
		disEnd[endId] = 0;
		Queue<Integer> queEnd = new LinkedList<>();
		queEnd.offer(endId);

		while (!queBegin.isEmpty() && !queEnd.isEmpty()) {
			Integer nodeBegin = getInteger(disBegin, queBegin, disEnd);
			if (nodeBegin != null) return nodeBegin;

			Integer nodeEnd = getInteger(disEnd, queEnd, disBegin);
			if (nodeEnd != null) return nodeEnd;
		}
		return 0;
	}

	public void addEdge(String word) {
		addWord(word);
		int    id1    = wordId.get(word);
		char[] array  = word.toCharArray();
		int    length = array.length;
		for (int i = 0; i < length; ++i) {
			char tmp = array[i];
			array[i] = '*';
			String newWord = new String(array);
			addWord(newWord);
			int id2 = wordId.get(newWord);
			edge.get(id1).add(id2);
			edge.get(id2).add(id1);
			array[i] = tmp;
		}
	}

	private Integer getInteger(int[] disBegin, Queue<Integer> queBegin, int[] disEnd) {
		int queBeginSize = queBegin.size();
		for (int i = 0; i < queBeginSize; ++i) {
			int nodeBegin = queBegin.poll();
			if (disEnd[nodeBegin] != Integer.MAX_VALUE) {
				return (disBegin[nodeBegin] + disEnd[nodeBegin]) / 2 + 1;
			}
			for (int it : edge.get(nodeBegin)) {
				if (disBegin[it] == Integer.MAX_VALUE) {
					disBegin[it] = disBegin[nodeBegin] + 1;
					queBegin.offer(it);
				}
			}
		}
		return null;
	}

	public void addWord(String word) {
		if (!wordId.containsKey(word)) {
			wordId.put(word, nodeNum++);
			edge.add(new ArrayList<>());
		}
	}
}