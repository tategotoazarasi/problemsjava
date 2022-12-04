package leetcode.perform_string_shifts;

/**
 * 1427. 字符串的左右移
 */
public class Solution {
	public String stringShift(String s, int[][] shift) {
		int offset = 0;
		for (int[] sft : shift) {
			offset += (sft[0] == 1) ? (-sft[1]) : (sft[1]);
		}
		while (offset < 0) {
			offset += s.length();
		}
		offset = offset % s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt((offset + i) % s.length()));
		}
		return sb.toString();
	}
}