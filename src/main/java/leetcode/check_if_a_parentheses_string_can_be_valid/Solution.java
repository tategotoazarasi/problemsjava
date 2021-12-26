package leetcode.check_if_a_parentheses_string_can_be_valid;

public class Solution {
    public boolean canBeValid(String s, String locked) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(' && locked.charAt(i) == '1') || left == 0) {
                left++;
            } else {
                left--;
            }

            if (s.charAt(i) == ')' && locked.charAt(i) == '1') {
                right--;
            } else {
                right++;
            }
            if (right < 0) {
                return false;
            }
        }
        return left == 0;
    }
}
