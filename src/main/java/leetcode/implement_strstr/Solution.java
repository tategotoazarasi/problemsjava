package leetcode.implement_strstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty() || needle.isBlank()) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}