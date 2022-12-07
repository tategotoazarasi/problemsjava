package leetcode.common;

/**
 * Polynomial singly-linked list.
 */
public class PolyNode {
	public int      coefficient;
	public int      power;
	public PolyNode next = null;

	PolyNode() {}

	public PolyNode(int x, int y) {
		this.coefficient = x;
		this.power       = y;
	}

	public PolyNode(int x, int y, PolyNode next) {
		this.coefficient = x;
		this.power       = y;
		this.next        = next;
	}
}