package leetcode.largest_rectangle_in_histogram;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 84. 柱状图中最大的矩形
 */
public class Solution {
	public int largestRectangleArea(int[] heights) {
		int   n     = heights.length;
		int[] left  = new int[n];
		int[] right = new int[n];

		Deque<Integer> monoStack = new ArrayDeque<>();
		for (int i = 0; i < n; ++i) {
			while (!monoStack.isEmpty() && heights[monoStack.peek()] >= heights[i]) {
				monoStack.pop();
			}
			left[i] = (monoStack.isEmpty() ? -1 : monoStack.peek());
			monoStack.push(i);
		}

		monoStack.clear();
		for (int i = n - 1; i >= 0; --i) {
			while (!monoStack.isEmpty() && heights[monoStack.peek()] >= heights[i]) {
				monoStack.pop();
			}
			right[i] = (monoStack.isEmpty() ? n : monoStack.peek());
			monoStack.push(i);
		}

		int ans = 0;
		for (int i = 0; i < n; ++i) {
			ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
		}
		return ans;
	}
}