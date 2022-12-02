package leetcode.length_of_last_word;

public class Solution {
	public int lengthOfLastWord(String s) {
		int     length = 0;
		boolean flag1  = true;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (flag1) {
				if (s.charAt(i) == ' ') {
					continue;
				} else {
					flag1 = false;
					length++;
					continue;
				}
			}

			if (s.charAt(i) != ' ') {
				length++;
			} else {
				break;
			}
		}
		return length;
	}
}