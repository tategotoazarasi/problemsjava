package problems.merge_two_sorted_lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode ret = list;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list.next = new ListNode(list1.val);
                list = list.next;
                list1 = list1.next;
            } else {
                list.next = new ListNode(list2.val);
                list = list.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            list.next = list2;
        } else {
            list.next = list1;
        }
        return ret.next;
    }
}