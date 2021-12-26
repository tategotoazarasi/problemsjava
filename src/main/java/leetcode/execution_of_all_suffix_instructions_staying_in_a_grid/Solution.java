package leetcode.execution_of_all_suffix_instructions_staying_in_a_grid;

public class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int x = startPos[1];
            int y = startPos[0];
            for (int j = i; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case 'L':
                        x--;
                        break;
                    case 'R':
                        x++;
                        break;
                    case 'U':
                        y--;
                        break;
                    case 'D':
                        y++;
                        break;
                }

                if (x < 0 || x >= n || y < 0 || y >= n) {
                    ans[i] = j - i;
                    break;
                }
                if (j == s.length() - 1) {
                    ans[i] = s.length() - i;
                    break;
                }
            }
        }
        return ans;
    }
}
