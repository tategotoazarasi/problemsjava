package leetcode.remove_duplicates_from_sorted_list;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        for (ListNode iterator = head; iterator.next != null; iterator = iterator.next) {
            while (iterator.val == iterator.next.val) {
                if (iterator.next.next == null) {
                    iterator.next = null;
                    return head;
                }
                iterator.next = iterator.next.next;
            }
        }
        return head;
    }
}