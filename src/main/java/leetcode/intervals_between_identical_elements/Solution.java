package leetcode.intervals_between_identical_elements;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public long[] getDistances(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], t -> new ArrayList<>()).add(i);
        }
        long[] result = new long[arr.length];
        for (ArrayList<Integer> list : map.values()) {
            for (int i : list) {
                result[list.get(0)] += i - list.get(0);
            }
            for (int i = 1; i < list.size(); i++) {
                //相同数字右移一位的增加量
                result[list.get(i)] = result[list.get(i - 1)] + (2L * i - list.size()) * (list.get(i) - list.get(i - 1));
            }
        }
        return result;
    }
}
