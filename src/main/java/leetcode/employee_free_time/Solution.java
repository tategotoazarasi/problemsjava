package leetcode.employee_free_time;

import java.util.ArrayList;
import java.util.List;

/**
 * 759. 员工空闲时间
 */
public class Solution {
	public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
		List<Frame> l = new ArrayList<>();
		for (List<Interval> li : schedule) {
			for (Interval i : li) {
				l.add(new Frame(i.start, true));
				l.add(new Frame(i.end, false));
			}
		}
		l.sort((o1, o2) -> {
			if (o1.time != o2.time) {
				return Integer.compare(o1.time, o2.time);
			} else if (o1.inOut != o2.inOut) {
				return o1.inOut ? -1 : 1;
			} else {
				return 0;
			}
		});
		boolean inRest = true;
		int     prev   = Integer.MIN_VALUE;
		int     cnt    = 0;

		List<Interval> ans = new ArrayList<>();
		for (Frame f : l) {
			if (f.inOut) {
				cnt++;
			} else {
				cnt--;
			}
			if (inRest && cnt > 0) {
				inRest = false;
				if (prev != Integer.MIN_VALUE) {
					ans.add(new Interval(prev, f.time));
				}
			} else if (!inRest && cnt == 0) {
				inRest = true;
				prev   = f.time;
			}
		}
		return ans;
	}

	private class Interval {
		public int start;
		public int end;

		public Interval() {}

		public Interval(int _start, int _end) {
			start = _start;
			end   = _end;
		}
	}

	private class Frame {
		public int     time;
		public boolean inOut; // true=in false=out

		public Frame(int time, boolean inOut) {
			this.time  = time;
			this.inOut = inOut;
		}
	}
}