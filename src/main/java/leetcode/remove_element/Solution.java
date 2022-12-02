package leetcode.remove_element;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int sum = 0;
		for (int i : nums) {
			if (i != val) {
				sum++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] != val) {
						nums[i] = nums[j];
						nums[j] = val;
						break;
					}
				}
			}
		}
		return sum;
	}
}