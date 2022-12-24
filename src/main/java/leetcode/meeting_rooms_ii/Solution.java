package leetcode.meeting_rooms_ii;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * 253. 会议室 II
 */
public class Solution {
	public int minMeetingRooms(int[][] intervals) {
		int                       ans     = 0;
		int                       current = 0;
		int                       prev    = -10;
		TreeMap<Integer, Integer> m       = new TreeMap<>();
		Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
		for (int[] interval : intervals) {
			current++;
			m.put(interval[1], m.getOrDefault(interval[1], 0) + 1);
			var es = m.subMap(prev + 1, interval[0] + 1).entrySet();
			for (var e : es) {
				current -= e.getValue();
			}
			prev = interval[0];
			ans  = Math.max(ans, current);
		}
		return ans;
	}
}