package leetcode.maximum_depth_of_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void maxDepth() {
		Solution sol = new Solution();
		assertEquals(3,
		             sol.maxDepth(new TreeNode(3,
		                                       new TreeNode(9),
		                                       new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
	}
}