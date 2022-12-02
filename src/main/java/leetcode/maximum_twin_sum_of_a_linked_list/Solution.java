package leetcode.maximum_twin_sum_of_a_linked_list;

import leetcode.common.ListNode;

import java.util.ArrayList;

/**
 * LeetCode 5961. 链表最大孪生和
 */
public class Solution {
	public int pairSum(ListNode head) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (; head != null; head = head.next) {
			arr.add(head.val);
		}
		int max = 0;
		for (int i = 0, j = arr.size() - 1; i < j; i++, j--) {
			int sum = arr.get(i) + arr.get(j);
			if (max < sum) {
				max = sum;
			}
		}
		return max;
	}
}