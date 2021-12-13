package leetcode.remove_duplicates_from_sorted_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void deleteDuplicates() {
        Solution sol = new Solution();
        ListNode case1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode ans1 = new ListNode(1, new ListNode(2));
        ListNode case2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode ans2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode res1 = sol.deleteDuplicates(case1);
        ListNode res2 = sol.deleteDuplicates(case2);
        assertTrue(ListNodeEqual(ans1, res1));
        assertTrue(ListNodeEqual(ans2, res2));
    }

    boolean ListNodeEqual(ListNode node1, ListNode node2) {
        for (; node1.next != null && node2.next != null; node1 = node1.next, node2 = node2.next) {
            if (node1.val != node2.val) {
                return false;
            }
        }
        return node1.next == null && node2.next == null;
    }
}