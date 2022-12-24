package leetcode.remove_max_number_of_edges_to_keep_graph_fully_traversable;

import leetcode.common.UnionFind;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1579. 保证图可完全遍历
 */
public class Solution {
	Set<int[]> edges1 = new HashSet<>();
	Set<int[]> edges2 = new HashSet<>();
	Set<int[]> edges3 = new HashSet<>();

	public int maxNumEdgesToRemove(int n, int[][] edges) {
		int           cnt1 = n;
		int           cnt2 = n;
		int           ans  = 0;
		List<Integer> l    = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			l.add(i);
		}
		UnionFind<Integer> uf = new UnionFind<>(l);
		for (int[] edge : edges) {
			if (edge[0] == 3) {
				edges3.add(edge);
			} else if (edge[0] == 2) {
				edges2.add(edge);
			} else {
				edges1.add(edge);
			}
		}

		for (int[] edge : edges3) {
			if (uf.same(edge[1], edge[2])) {
				ans++;
			} else {
				uf.unite(edge[1], edge[2]);
				cnt1--;
				cnt2--;
			}
		}

		UnionFind<Integer> uf1 = new UnionFind<>(uf);
		for (int[] edge : edges1) {
			if (uf1.same(edge[1], edge[2])) {
				ans++;
			} else {
				uf1.unite(edge[1], edge[2]);
				cnt1--;
			}
		}

		UnionFind<Integer> uf2 = new UnionFind<>(uf);
		for (int[] edge : edges2) {
			if (uf2.same(edge[1], edge[2])) {
				ans++;
			} else {
				uf2.unite(edge[1], edge[2]);
				cnt2--;
			}
		}

		if (cnt1 != 1 || cnt2 != 1) {
			return -1;
		}
		return ans;
	}
}