package leetcode.kth_smallest_element_in_a_sorted_matrix;

import leetcode.common.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 378. 有序矩阵中第 K 小的元素
 */
public class Solution {
	public int kthSmallest(int[][] matrix, int k) {
		PriorityQueue<Pair<Integer, Integer>>
				pq =
				new PriorityQueue<>(Comparator.comparingInt(o -> matrix[o.first][o.second]));
		pq.add(new Pair<>(0, 0));
		int         n   = matrix.length;
		boolean[][] vis = new boolean[n][n];
		while (!pq.isEmpty()) {
			Pair<Integer, Integer> p = pq.poll();
			if (vis[p.first][p.second]) {
				continue;
			}
			k--;
			if (k == 0) {
				return matrix[p.first][p.second];
			}
			vis[p.first][p.second] = true;
			int[] next_xs = {p.first, p.first + 1};
			int[] next_ys = {p.second + 1, p.second};
			for (int i = 0; i < 2; i++) {
				int x = next_xs[i];
				int y = next_ys[i];
				if (x < n && y < n && !vis[x][y]) {
					pq.add(new Pair<>(x, y));
				}
			}
		}
		return -1;
	}
}