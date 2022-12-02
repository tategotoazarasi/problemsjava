package leetcode.sum_of_all_odd_length_subarrays;

/**
 * 1588. 所有奇数长度子数组的和
 */
public class Solution {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		int n   = arr.length;
		for (int i = 0; i < n; i++) {
			int leftCount = i, rightCount = n - i - 1;
			int leftOdd   = (leftCount + 1) / 2;
			int rightOdd  = (rightCount + 1) / 2;
			int leftEven  = leftCount / 2 + 1;
			int rightEven = rightCount / 2 + 1;
			sum += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
		}
		return sum;
	}
}