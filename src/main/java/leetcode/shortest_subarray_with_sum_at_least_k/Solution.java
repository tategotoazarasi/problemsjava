package leetcode.shortest_subarray_with_sum_at_least_k;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 862. 和至少为 K 的最短子数组
 */
public class Solution {
	public int shortestSubarray(int[] nums, int k) {
		int    n         = nums.length;
		long[] preSumArr = new long[n + 1];
		for (int i = 0; i < n; i++) {
			preSumArr[i + 1] = preSumArr[i] + nums[i];
		}
		int            res   = n + 1;
		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i <= n; i++) {
			long curSum = preSumArr[i];
			while (!queue.isEmpty() && curSum - preSumArr[queue.peekFirst()] >= k) {
				res = Math.min(res, i - queue.pollFirst());
			}
			while (!queue.isEmpty() && preSumArr[queue.peekLast()] >= curSum) {
				queue.pollLast();
			}
			queue.offerLast(i);
		}
		return res < n + 1 ? res : -1;
	}
}
