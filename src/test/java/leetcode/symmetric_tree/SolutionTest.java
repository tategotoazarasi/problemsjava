package leetcode.symmetric_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	@Test
	void isSymmetric() {
		Solution sol = new Solution();
		assertTrue(sol.isSymmetric(new TreeNode(1,
		                                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
		                                        new TreeNode(2, new TreeNode(4), new TreeNode(3)))));
		assertFalse(sol.isSymmetric(new TreeNode(1,
		                                         new TreeNode(2, null, new TreeNode(3)),
		                                         new TreeNode(2, null, new TreeNode(3)))));
	}
}