package leetcode.linked_list_cycle;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	@Test
	void hasCycle() {
		Solution sol = new Solution();

		ListNode case1_node1 = new ListNode(2);
		case1_node1.next = new ListNode(0, new ListNode(-4, case1_node1));
		assertTrue(sol.hasCycle(new ListNode(3, case1_node1)));

		ListNode case2_node0 = new ListNode(1);
		case2_node0.next = new ListNode(2, case2_node0);
		assertTrue(sol.hasCycle(case2_node0));

		assertFalse(sol.hasCycle(new ListNode(1)));
	}
}