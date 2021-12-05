package problems.longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        if (strs[0].length() == 0) {
            return "";
        }
        for (short i = 0; ; i++) {
            if (i >= strs[0].length()) {
                return sb.toString();
            }
            char ch = strs[0].charAt(i);
            for (short j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return sb.toString();
                }
                if (strs[j].charAt(i) != ch) {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
    }
}
