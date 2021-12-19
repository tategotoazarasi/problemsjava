package leetcode.path_sum;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void hasPathSum() {
        Solution sol = new Solution();
        assertTrue(sol.hasPathSum(new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))), 22));
        assertFalse(sol.hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
    }
}