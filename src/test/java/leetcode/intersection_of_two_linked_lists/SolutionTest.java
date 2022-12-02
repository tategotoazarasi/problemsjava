package leetcode.intersection_of_two_linked_lists;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

	@Test
	void getIntersectionNode() {
		Solution sol = new Solution();

		ListNode case1  = new ListNode(8, new ListNode(4, new ListNode(5)));
		ListNode case1a = new ListNode(4, new ListNode(1, case1));
		ListNode case1b = new ListNode(5, new ListNode(6, new ListNode(1, case1)));
		assertEquals(case1, sol.getIntersectionNode(case1a, case1b));

		ListNode case2  = new ListNode(2, new ListNode(4));
		ListNode case2a = new ListNode(1, new ListNode(9, new ListNode(1, case2)));
		ListNode case2b = new ListNode(3, case2);
		assertEquals(case2, sol.getIntersectionNode(case2a, case2b));

		ListNode case3a = new ListNode(2, new ListNode(6, new ListNode(4)));
		ListNode case3b = new ListNode(1, new ListNode(5));
		assertNull(sol.getIntersectionNode(case3a, case3b));
	}
}