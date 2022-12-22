package leetcode.possible_bipartition;

import java.util.*;

/**
 * 886. 可能的二分法
 */
public class Solution {
	public boolean possibleBipartition(int n, int[][] dislikes) {
		int[]                       group = new int[n + 1];
		Map<Integer, List<Integer>> dslk  = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			group[i] = -1;
			dslk.put(i, new ArrayList<>());
		}
		for (int[] p : dislikes) {
			dslk.get(p[0]).add(p[1]);
			dslk.get(p[1]).add(p[0]);
		}
		Queue<Integer> q = new LinkedList<>(); ///< 组号 编号
		for (int i = 1; i <= n; i++) {
			if (group[i] == -1) {
				group[i] = 0;
				q.add(i);
				while (!q.isEmpty()) {
					int item = q.remove();
					for (int enemy : dslk.get(item)) {
						if (group[enemy] >= 0 && group[enemy] == group[item]) {
							return false;
						} else if (group[enemy] == -1) {
							group[enemy] = group[item] == 1 ? 0 : 1;
							q.add(enemy);
						}
					}
				}
			}
		}
		return true;
	}
}
