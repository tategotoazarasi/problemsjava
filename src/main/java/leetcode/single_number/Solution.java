package leetcode.single_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> setSingle = new HashSet<>();
        Set<Integer> setMulti = new HashSet<>();
        for (int num : nums) {
            if (setMulti.contains(num)) {
                continue;
            }
            if (setSingle.contains(num)) {
                setSingle.remove(num);
                setMulti.add(num);
                continue;
            }
            setSingle.add(num);
        }
        return setSingle.iterator().next();
    }
}