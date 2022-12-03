package leetcode.longest_consecutive_sequence;

import java.util.Arrays;

/**
 * 128. 最长连续序列
 */
public class Solution {
	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		int ans = 0;
		int cur = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 1) {
				cur++;
			} else if (nums[i] - nums[i - 1] > 1) {
				ans = Math.max(ans, cur);
				cur = 1;
			}
		}
		ans = Math.max(ans, cur);
		return ans;
	}
}