package leetcode.number_of_islands_ii;

import leetcode.common.UnionFind;

import java.util.*;

/**
 * 305. 岛屿数量 II
 */
public class Solution {
	public List<Integer> numIslands2(int m, int n, int[][] positions) {
		List<Integer> ans     = new LinkedList<>();
		int           current = 0;
		Set<Integer>  land    = new HashSet<>();
		List<Integer> l       = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				l.add(i * n + j);
			}
		}
		UnionFind<Integer> uf = new UnionFind<>(l);
		for (int[] position : positions) {
			int x = position[0];
			int y = position[1];
			int v = x * n + y;
			if (!land.contains(v)) {
				land.add(v);
				int[] next_xs = {x + 1, x - 1, x, x};
				int[] next_ys = {y, y, y + 1, y - 1};
				for (int i = 1; i < 4; i++) {
					for (int j = 0; j < i; j++) {
						int next_xi = next_xs[i];
						int next_yi = next_ys[i];
						int next_xj = next_xs[j];
						int next_yj = next_ys[j];
						if (next_xi >= 0 && next_xi < m && next_yi >= 0 && next_yi < n &&
						    next_xj >= 0 && next_xj < m && next_yj >= 0 && next_yj < n) {
							int vi = next_xi * n + next_yi;
							int vj = next_xj * n + next_yj;
							if (land.contains(vi) && land.contains(vj)) {
								if (!uf.same(vi, vj)) {
									current--;
									uf.unite(vi, vj);
								}
							}
						}
					}
				}
				boolean flag = true;
				for (int i = 0; i < 4; i++) {
					int next_x = next_xs[i];
					int next_y = next_ys[i];
					if (next_x >= 0 && next_x < m && next_y >= 0 && next_y < n) {
						int next_v = next_x * n + next_y;
						if (land.contains(next_v)) {
							flag = false;
							uf.unite(v, next_v);
						}
					}
				}
				if (flag) {
					current++;
				}
			}
			ans.add(current);
		}
		return ans;
	}
}