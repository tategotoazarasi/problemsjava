package leetcode.palindrome_pairs;

import java.util.*;

/**
 * 336. 回文对
 */
public class Solution {
	public List<List<Integer>> palindromePairs(String[] words) {
		List<List<Integer>>  ans     = new ArrayList<>();
		Map<String, Integer> drowMap = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == 0) {
				for (int j = 0; j < words.length; j++) {
					if (j != i && isPalindrome(words[j], 0, words[j].length())) {
						ans.add(Arrays.asList(i, j));
						ans.add(Arrays.asList(j, i));
					}
				}
			} else {
				StringBuilder sb = new StringBuilder(words[i]);
				sb.reverse();
				drowMap.put(sb.toString(), i);
			}
		}
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int j = 0; j < word.length(); j++) {
				if (isPalindrome(word, 0, j)) {
					Integer p = drowMap.get(word.substring(j));
					if (p != null && p != i) {
						ans.add(Arrays.asList(p, i));
					}
				}
				if (isPalindrome(word, j, word.length())) {
					Integer p = drowMap.get(word.substring(0, j));
					if (p != null && p != i) {
						ans.add(Arrays.asList(i, p));
					}
				}
			}
		}
		return ans;
	}

	private boolean isPalindrome(String str, int i, int j) {
		while (i < j) {
			if (str.charAt(i) != str.charAt(j - 1)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}