package leetcode.reverse_integer;

public class Solution {
	public int reverse(int x) {
		String        s  = Integer.toString(Math.abs(x));
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		try {
			int res = Integer.parseInt(sb.toString());
			return x > 0 ? res : -res;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}