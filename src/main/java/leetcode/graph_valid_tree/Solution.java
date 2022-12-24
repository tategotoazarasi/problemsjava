package leetcode.graph_valid_tree;

import java.util.*;

/**
 * 261. 以图判树
 */
public class Solution {
	private final Map<Integer, List<Integer>> g   = new HashMap<>();
	private final Set<Integer>                vis = new HashSet<>();

	public boolean validTree(int n, int[][] edges) {
		for (int i = 0; i < n; i++) {
			g.put(i, new LinkedList<>());
		}
		for (int[] edge : edges) {
			g.get(edge[0]).add(edge[1]);
			g.get(edge[1]).add(edge[0]);
		}
		if (!dfs(-1, 0)) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			if (!vis.contains(i)) {
				return false;
			}
		}
		return true;
	}

	private boolean dfs(int prev, int current) {
		vis.add(current);
		for (int next : g.get(current)) {
			if (next != prev) {
				if (vis.contains(next)) {
					return false;
				} else {
					dfs(current, next);
				}
			}
		}
		return true;
	}
}
