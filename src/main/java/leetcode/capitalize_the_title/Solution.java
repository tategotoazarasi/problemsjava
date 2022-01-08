package leetcode.capitalize_the_title;

public class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] strs = title.split(" ");
        for (String str : strs) {
            if (str.length() > 2) {
                sb.append(Character.toUpperCase(str.charAt(0)));
                sb.append(str.substring(1).toLowerCase());
            } else {
                sb.append(str.toLowerCase());
            }
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}