package leetcode.number_of_connected_components_in_an_undirected_graph;

import leetcode.common.UnionFind;

import java.util.ArrayList;
import java.util.List;

/**
 * 323. 无向图中连通分量的数目
 */
public class Solution {
	public int countComponents(int n, int[][] edges) {
		int           ans = n;
		List<Integer> l   = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			l.add(i);
		}
		UnionFind<Integer> uf = new UnionFind<>(l);
		for (int[] edge : edges) {
			if (!uf.same(edge[0], edge[1])) {
				uf.unite(edge[0], edge[1]);
				ans--;
			}
		}
		return ans;
	}
}