package problems.add_binary;

public class Solution {
    public String addBinary(String a, String b) {
        int max_length = Math.max(a.length(), b.length());
        if (b.length() == max_length) {
            String temp = a;
            a = b;
            b = temp;
        }
        int[] ret = new int[max_length];
        boolean round = false;
        for (int i = max_length - 1; i >= 0; i--) {
            char a_char = a.charAt(i);
            int b_index = i - (a.length() - b.length());
            char b_char = b_index >= 0 ? b.charAt(b_index) : 0;
            int a_i = a_char == '1' ? 1 : 0;
            int b_i = b_char == '1' ? 1 : 0;
            int r_i = round ? 1 : 0;
            int sum = a_i + b_i + r_i;
            switch (sum) {
                case 0: {
                    ret[i] = 0;
                    round = false;
                    break;
                }
                case 1: {
                    ret[i] = 1;
                    round = false;
                    break;
                }
                case 2: {
                    ret[i] = 0;
                    round = true;
                    break;
                }
                case 3: {
                    ret[i] = 1;
                    round = true;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (round) {
            sb.append('1');
        }
        for (int i = 0; i < max_length; i++) {
            if (ret[i] == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }
}