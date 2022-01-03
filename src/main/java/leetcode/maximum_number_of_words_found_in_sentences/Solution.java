package leetcode.maximum_number_of_words_found_in_sentences;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String str : sentences) {
            int num = str.split(" ").length;
            max = Math.max(max, num);
        }
        return max;
    }
}
