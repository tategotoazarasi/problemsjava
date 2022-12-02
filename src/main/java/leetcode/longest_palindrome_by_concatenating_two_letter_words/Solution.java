package leetcode.longest_palindrome_by_concatenating_two_letter_words;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 5962. 连接两字母单词得到的最长回文串
 */
public class Solution {
	boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {return false;}
			i++;
			j--;
		}
		return true;
	}

	public int longestPalindrome(String[] words) {
		int                      count = 0;
		HashMap<String, Integer> map   = new HashMap<>();
		for (String word : words) {
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				map.put(word, map.get(word) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) {
				String drow = new StringBuffer(entry.getKey()).reverse().toString();
				if (map.containsKey(drow) && map.get(drow) != 0) {
					if (drow.equals(entry.getKey())) {
						count += drow.length() * 2 * (entry.getValue() / 2);
						entry.setValue(entry.getValue() % 2);
						continue;
					}
					int min = Math.min(map.get(drow), entry.getValue());
					count += drow.length() * 2 * min;
					map.put(drow, map.get(drow) - min);
					entry.setValue(entry.getValue() - min);
				}
			}
		}
		int max = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0 && isPalindrome(entry.getKey())) {
				if (max < entry.getKey().length()) {
					max = entry.getKey().length();
				}
			}
		}
		return count + max;
	}
}