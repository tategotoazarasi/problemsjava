package leetcode.the_skyline_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 218. 天际线问题
 */
public class Solution {
	public List<List<Integer>> getSkyline(int[][] buildings) {
		List<List<Integer>>       ans = new ArrayList<>();
		TreeMap<Integer, Integer> top = new TreeMap<>();
		for (int[] building : buildings) {
			top.put(building[0], Math.max(top.getOrDefault(building[0], 0), building[2]));
			top.put(building[1], top.getOrDefault(building[1], 0));
		}
		for (int[] building : buildings) {
			var es = top.subMap(building[0] + 1, building[1]).entrySet();
			for (var entry : es) {
				entry.setValue(Math.max(entry.getValue(), building[2]));
			}
		}
		int prevH = 0;
		for (var entry : top.entrySet()) {
			if (entry.getValue() != prevH) {
				List<Integer> p = new ArrayList<>();
				p.add(entry.getKey());
				p.add(entry.getValue());
				ans.add(p);
			}
			prevH = entry.getValue();
		}
		return ans;
	}
}