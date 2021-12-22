package leetcode.linked_list_cycle;

import leetcode.common.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode end = new ListNode(-100001);
        for (ListNode node = head; node.next != null; ) {
            if (node.next.val == end.val) {
                return true;
            } else {
                ListNode temp = node.next;
                node.next = end;
                node = temp;
            }
        }
        return false;
    }
}