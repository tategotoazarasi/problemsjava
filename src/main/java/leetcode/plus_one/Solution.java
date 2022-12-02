package leetcode.plus_one;

public class Solution {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;
			if (digits[i] >= 10) {
				digits[i] -= 10;
				if (i == 0) {
					int[] ret = new int[digits.length + 1];
					ret[0] = 1;
					System.arraycopy(digits, 0, ret, 1, digits.length);
					return ret;
				}
			} else {
				return digits;
			}
		}
		return digits;
	}
}