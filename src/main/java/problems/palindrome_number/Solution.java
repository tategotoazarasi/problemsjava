package problems.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int lenx = 1;
        int x2 = x / 10;
        while (x2 != 0) {
            lenx++;
            x2 /= 10;
        }
        x2 = x;
        for (int len = lenx; len > 1; len -= 2) {
            int l = (x2 / (int) (Math.pow(10, len - 1)));
            int r = x2 % 10;
            if (l != r) {
                return false;
            }
            x2 = x2 - l * (int) (Math.pow(10, len - 1));
            x2 = (x2 - r) / 10;
        }
        return true;
    }
}
