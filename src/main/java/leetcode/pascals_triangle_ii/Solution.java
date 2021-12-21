package leetcode.pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>(rowIndex + 1);
        ret.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            ret.add((int) ((long) ret.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return ret;
    }
}