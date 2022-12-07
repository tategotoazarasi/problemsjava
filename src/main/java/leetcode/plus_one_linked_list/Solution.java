package leetcode.plus_one_linked_list;

import leetcode.common.ListNode;

/**
 * 369. 给单链表加一
 */
public class Solution {
	public ListNode plusOne(ListNode head) {
		if (carry(head) == 1) {
			return new ListNode(1, head);
		} else {
			return head;
		}
	}

	private int carry(ListNode node) {
		if (node.next == null) {
			node.val++;
		} else {
			node.val += carry(node.next);
		}
		if (node.val >= 10) {
			node.val -= 10;
			return 1;
		} else {
			return 0;
		}
	}
}