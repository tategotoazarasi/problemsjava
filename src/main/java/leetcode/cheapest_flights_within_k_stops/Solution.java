package leetcode.cheapest_flights_within_k_stops;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 787. K 站中转内最便宜的航班
 */
public class Solution {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		int[] shortest = new int[n];
		int[] cheapest = new int[n];
		for (int i = 0; i < n; i++) {
			shortest[i] = Integer.MAX_VALUE;
			cheapest[i] = Integer.MAX_VALUE;
		}
		PriorityQueue<Frame>
				pq =
				new PriorityQueue<>((o1, o2) -> o1.cost != o2.cost ? o1.cost - o2.cost : o1.length - o2.length);
		Map<Integer, Map<Integer, Integer>> g = new HashMap<>();
		for (int i = 0; i < n; i++) {
			g.put(i, new HashMap<>());
		}
		for (int[] flight : flights) {
			g.get(flight[0]).put(flight[1], flight[2]);
		}
		pq.add(new Frame(src, 1, 0));
		while (!pq.isEmpty()) {
			Frame f = pq.poll();
			if (f.current == dst) {
				return f.cost;
			}
			if (f.length >= shortest[f.current] && f.cost >= cheapest[f.current]) {
				continue;
			}
			shortest[f.current] = Math.min(shortest[f.current], f.length);
			cheapest[f.current] = Math.min(cheapest[f.current], f.cost);
			if (f.length + 1 <= k + 2) {
				for (var entry : g.get(f.current).entrySet()) {
					pq.add(new Frame(entry.getKey(), f.length + 1, f.cost + entry.getValue()));
				}
			}
		}
		return -1;
	}

	private class Frame {
		public int current;
		public int length;
		public int cost;

		public Frame(int current, int length, int cost) {
			this.current = current;
			this.length  = length;
			this.cost    = cost;
		}
	}
}