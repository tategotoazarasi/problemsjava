package leetcode.add_two_polynomials_represented_as_linked_lists;

import leetcode.common.PolyNode;

/**
 * 1634. 求两个多项式链表的和
 */
public class Solution {
	public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
		PolyNode ans  = null;
		PolyNode last = null;
		while (poly1 != null || poly2 != null) {
			if (poly1 != null && poly2 != null && poly1.power == poly2.power) {
				PolyNode pn = new PolyNode(poly1.coefficient + poly2.coefficient, poly1.power);
				if (pn.coefficient == 0) {
					poly1 = poly1.next;
					poly2 = poly2.next;
					continue;
				}
				if (ans == null) {
					ans  = pn;
					last = pn;
				} else {
					last.next = pn;
					last      = last.next;
				}
				poly1     = poly1.next;
				poly2     = poly2.next;
				last.next = null;
			} else {
				PolyNode pn;
				if ((poly1 != null && poly2 != null && poly1.power > poly2.power) || (poly1 != null && poly2 == null)) {
					pn    = poly1;
					poly1 = poly1.next;
				} else {
					pn    = poly2;
					poly2 = poly2.next;
				}
				if (pn.coefficient == 0) {
					continue;
				}
				pn.next = null;
				if (ans == null) {
					ans  = pn;
					last = pn;
				} else {
					last.next = pn;
					last      = last.next;
				}
			}
		}
		return ans;
	}
}