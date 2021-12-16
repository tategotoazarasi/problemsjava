package leetcode.minimum_depth_of_binary_tree;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void minDepth() {
        Solution sol = new Solution();
        assertEquals(2, sol.minDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        assertEquals(5, sol.minDepth(new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))))));
    }
}