package leetcode.wiggle_sort_ii;

import java.util.Random;

/**
 * 324. 摆动排序 II
 */
public class Solution {
	Random random = new Random();

	public void wiggleSort(int[] nums) {
		int n      = nums.length;
		int x      = (n + 1) / 2;
		int mid    = x - 1;
		int target = findKthLargest(nums, n - mid);
		for (int k = 0, i = 0, j = n - 1; k <= j; k++) {
			if (nums[transAddress(k, n)] > target) {
				while (j > k && nums[transAddress(j, n)] > target) {
					j--;
				}
				swap(nums, transAddress(k, n), transAddress(j--, n));
			}
			if (nums[transAddress(k, n)] < target) {
				swap(nums, transAddress(k, n), transAddress(i++, n));
			}
		}
	}

	public int findKthLargest(int[] nums, int k) {
		int left  = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int pivot    = random.nextInt(right - left + 1) + left;
			int newPivot = partitionAroundPivot(left, right, pivot, nums);
			if (newPivot == k - 1) {
				return nums[newPivot];
			} else if (newPivot > k - 1) {
				right = newPivot - 1;
			} else {
				left = newPivot + 1;
			}
		}
		return nums[k - 1];
	}

	public int transAddress(int i, int n) {
		return (2 * n - 2 * i - 1) % (n | 1);
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public int partitionAroundPivot(int left, int right, int pivot, int[] nums) {
		int pivotValue = nums[pivot];
		int newPivot   = left;
		swap(nums, pivot, right);
		for (int i = left; i < right; ++i) {
			if (nums[i] > pivotValue) {
				swap(nums, i, newPivot++);
			}
		}
		swap(nums, right, newPivot);
		return newPivot;
	}
}