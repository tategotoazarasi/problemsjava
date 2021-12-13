package leetcode.roman_to_integer;

public class Solution {
    public int romanToInt(String s) {
        int[] vec = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I': {
                    vec[i] = 1;
                    break;
                }
                case 'V': {
                    vec[i] = 5;
                    break;
                }
                case 'X': {
                    vec[i] = 10;
                    break;
                }
                case 'L': {
                    vec[i] = 50;
                    break;
                }
                case 'C': {
                    vec[i] = 100;
                    break;
                }
                case 'D': {
                    vec[i] = 500;
                    break;
                }
                case 'M': {
                    vec[i] = 1000;
                    break;
                }
            }
        }
        int sum = 0;
        for (int i = vec.length - 1; i > 0; i--) {
            if ((vec[i] == 5 || vec[i] == 10) && vec[i - 1] == 1) {
                vec[i] -= 1;
                vec[i - 1] = 0;
            } else if ((vec[i] == 50 || vec[i] == 100) && vec[i - 1] == 10) {
                vec[i] -= 10;
                vec[i - 1] = 0;
            } else if ((vec[i] == 500 || vec[i] == 1000) && vec[i - 1] == 100) {
                vec[i] -= 100;
                vec[i - 1] = 0;
            }
            sum += vec[i];
        }
        sum += vec[0];
        return sum;
    }
}