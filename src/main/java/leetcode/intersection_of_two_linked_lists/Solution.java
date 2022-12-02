package leetcode.intersection_of_two_linked_lists;

import leetcode.common.ListNode;

import java.util.HashSet;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashSet<ListNode> set = new HashSet<>();
		for (ListNode nodeA = headA, nodeB = headB;
		     nodeA != null || nodeB != null;
		     nodeA = nodeA == null ? null : nodeA.next, nodeB = nodeB == null ? null : nodeB.next) {
			if (nodeA != null) {
				if (set.contains(nodeA)) {
					return nodeA;
				} else {
					set.add(nodeA);
				}
			}
			if (nodeB != null) {
				if (set.contains(nodeB)) {
					return nodeB;
				} else {
					set.add(nodeB);
				}
			}
		}
		return null;
	}
}