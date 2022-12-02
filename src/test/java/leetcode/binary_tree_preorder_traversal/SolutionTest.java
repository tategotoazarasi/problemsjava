package leetcode.binary_tree_preorder_traversal;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void preorderTraversal() {
		Solution      sol   = new Solution();
		List<Integer> case1 = sol.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
		assertEquals(1, case1.get(0));
		assertEquals(2, case1.get(1));
		assertEquals(3, case1.get(2));

		List<Integer> case2 = sol.preorderTraversal(null);
		assertEquals(0, case2.size());

		List<Integer> case3 = sol.preorderTraversal(new TreeNode(1));
		assertEquals(1, case3.get(0));

		List<Integer> case4 = sol.preorderTraversal(new TreeNode(1, new TreeNode(2), null));
		assertEquals(1, case4.get(0));
		assertEquals(2, case4.get(1));

		List<Integer> case5 = sol.preorderTraversal(new TreeNode(1, null, new TreeNode(2)));
		assertEquals(1, case5.get(0));
		assertEquals(2, case5.get(1));
	}
}