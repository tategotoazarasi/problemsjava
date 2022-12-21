package leetcode.remove_k_digits;

import java.util.Stack;

/**
 * 402. 移掉 K 位数字
 */
public class Solution {
	public String removeKdigits(String num, int k) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < num.length(); i++) {
			while (!stack.empty() && num.charAt(i) < stack.peek() && k > 0) {
				stack.pop();
				k--;
			}
			if (!stack.empty() || (stack.empty() && num.charAt(i) != '0')) {
				stack.push(num.charAt(i));
			}
		}
		while (k > 0 && !stack.empty()) {
			stack.pop();
			k--;
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		sb.reverse();
		if (sb.length() == 0) {
			return "0";
		} else {
			return sb.toString();
		}
	}
}