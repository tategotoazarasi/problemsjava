package leetcode.merge_two_sorted_lists;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void mergeTwoLists() {
		Solution sol = new Solution();
		ListNode
				l =
				new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
		ListNode
				r =
				sol.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
				                  new ListNode(1, new ListNode(3, new ListNode(4))));
		while (l != null) {
			assertEquals(l.val, r.val);
			l = l.next;
			r = r.next;
		}
		assertEquals(new ListNode().val, sol.mergeTwoLists(new ListNode(), new ListNode()).val);
		assertEquals(new ListNode(0).val, sol.mergeTwoLists(new ListNode(), new ListNode(0)).val);
	}
}