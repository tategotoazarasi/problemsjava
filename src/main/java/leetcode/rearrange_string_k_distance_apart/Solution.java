package leetcode.rearrange_string_k_distance_apart;

import java.util.*;

/**
 * 358. K 距离间隔重排字符串
 */
public class Solution {
	public String rearrangeString(String s, int k) {
		Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
		}
		PriorityQueue<Frame> pq = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1.cnt, o2.cnt));
		Queue<Frame>         q  = new LinkedList<>();
		for (var entry : m.entrySet()) {
			pq.add(new Frame(entry.getKey(), entry.getValue()));
		}
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			Frame f = pq.poll();
			sb.append(f.c);
			f.cnt--;
			if (f.cnt > 0) {
				while (q.size() < k - 1) {
					q.add(new Frame(' ', 0));
				}
				q.add(f);
			}
			if (!q.isEmpty()) {
				Frame fq = q.poll();
				if (fq.c != ' ') {
					pq.add(fq);
				}
			}
		}
		if (!q.isEmpty()) {
			return "";
		}
		return sb.toString();
	}

	private class Frame {
		public char c;
		public int  cnt;

		public Frame(char c, int cnt) {
			this.c   = c;
			this.cnt = cnt;
		}
	}
}