package leetcode.the_earliest_moment_when_everyone_become_friends;

import leetcode.common.UnionFind;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 1101. 彼此熟识的最早时间
 */
public class Solution {
	public int earliestAcq(int[][] logs, int n) {
		Arrays.sort(logs, Comparator.comparingInt(o -> o[0]));
		List<Integer> l = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			l.add(i);
		}
		int                cnt = n;
		UnionFind<Integer> uf  = new UnionFind<>(l);
		for (int[] log : logs) {
			if (!uf.same(log[1], log[2])) {
				cnt--;
				uf.unite(log[1], log[2]);
			}
			if (cnt == 1) {
				return log[0];
			}
		}
		return -1;
	}
}