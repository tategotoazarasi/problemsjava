package leetcode.binary_tree_postorder_traversal;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void postorderTraversal() {
		Solution      sol   = new Solution();
		List<Integer> case1 = sol.postorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
		assertEquals(3, case1.size());
		assertEquals(3, case1.get(0));
		assertEquals(2, case1.get(1));
		assertEquals(1, case1.get(2));
	}
}