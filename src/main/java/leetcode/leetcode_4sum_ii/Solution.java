package leetcode.leetcode_4sum_ii;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 */
public class Solution {
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		Map<Integer, Integer> m1 = new HashMap<>();
		for (int num1 : nums1) {
			for (int num2 : nums2) {
				if (!m1.containsKey(num1 + num2)) {
					m1.put(num1 + num2, 1);
				} else {
					m1.put(num1 + num2, m1.get(num1 + num2) + 1);
				}
			}
		}

		Map<Integer, Integer> m2 = new HashMap<>();
		for (int num3 : nums3) {
			for (int num4 : nums4) {
				if (!m2.containsKey(num3 + num4)) {
					m2.put(num3 + num4, 1);
				} else {
					m2.put(num3 + num4, m2.get(num3 + num4) + 1);
				}
			}
		}
		int ans = 0;
		for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
			if (m2.containsKey(-entry.getKey())) {
				ans += entry.getValue() * m2.get(-entry.getKey());
			}
		}

		return ans;
	}
}