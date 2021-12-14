package leetcode.same_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isSameTree() {
        Solution sol = new Solution();
        TreeNode case1p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode case1q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(sol.isSameTree(case1p, case1q));

        TreeNode case2p = new TreeNode(1, new TreeNode(2), null);
        TreeNode case2q = new TreeNode(1, null, new TreeNode(2));
        assertFalse(sol.isSameTree(case2p, case2q));

        TreeNode case3p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode case3q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(sol.isSameTree(case3p, case3q));
    }
}