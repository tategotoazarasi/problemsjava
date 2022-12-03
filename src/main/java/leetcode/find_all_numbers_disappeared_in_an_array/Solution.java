package leetcode.find_all_numbers_disappeared_in_an_array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 448. 找到所有数组中消失的数字
 */
public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> s = new HashSet<Integer>();
		for (int num : nums) {
			s.add(num);
		}
		List<Integer> ans = new LinkedList<>();
		for (int i = 1; i <= nums.length; i++) {
			if (!s.contains(i)) {
				ans.add(i);
			}
		}
		return ans;
	}
}