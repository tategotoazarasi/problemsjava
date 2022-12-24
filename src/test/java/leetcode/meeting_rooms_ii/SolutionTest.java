package leetcode.meeting_rooms_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void minMeetingRooms1() {
		Assertions.assertEquals(2, sol.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
	}

	@Test
	void minMeetingRooms2() {
		Assertions.assertEquals(1, sol.minMeetingRooms(new int[][]{{7, 10}, {2, 4}}));
	}

	@Test
	void minMeetingRooms3() {
		Assertions.assertEquals(1, sol.minMeetingRooms(new int[][]{{13, 15}, {1, 13}}));
	}

	@Test
	void minMeetingRooms4() {
		Assertions.assertEquals(2, sol.minMeetingRooms(new int[][]{{9, 14}, {5, 6}, {3, 5}, {12, 19}}));
	}
}