package leetcode.flatten_a_multilevel_doubly_linked_list;

class Node {
	public int  val;
	public Node prev;
	public Node next;
	public Node child;
}

/**
 * 430. 扁平化多级双向链表
 */
public class Solution {
	public Node flatten(Node head) {
		if (head == null) {
			return null;
		}
		flattenLast(head);
		return head;
	}

	private Node flattenLast(Node node) {
		if (node.child != null) {
			Node next = node.next;
			Node last = flattenLast(node.child);
			node.next       = node.child;
			node.child.prev = node;
			node.child      = null;
			last.next       = next;
			if (next != null) {
				next.prev = last;
			}
			if (next != null) {
				return flattenLast(next);
			} else {
				return last;
			}
		} else if (node.next == null) {
			return node;
		} else {
			return flattenLast(node.next);
		}
	}
}