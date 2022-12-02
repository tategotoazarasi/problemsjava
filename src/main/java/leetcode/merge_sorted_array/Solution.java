package leetcode.merge_sorted_array;

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0) {
			return;
		}
		if (m == 0) {
			System.arraycopy(nums2, 0, nums1, 0, m + n);
			return;
		}
		int[] ret = new int[m + n];
		int   i   = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				ret[k++] = nums1[i++];
			} else {
				ret[k++] = nums2[j++];
			}
		}
		if (i == m) {
			while (j < n) {
				ret[k++] = nums2[j++];
			}
		} else {
			while (i < m) {
				ret[k++] = nums1[i++];
			}
		}
		System.arraycopy(ret, 0, nums1, 0, m + n);
	}
}