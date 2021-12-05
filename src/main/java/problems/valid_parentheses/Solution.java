package problems.valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                try {
                    char ch2 = stack.pop();
                    if (ch2 + 1 != ch && ch2 + 2 != ch) {
                        return false;
                    }
                } catch (java.util.EmptyStackException e) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}