package leetcode.binary_tree_inorder_traversal;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void inorderTraversal() {
        Solution sol = new Solution();
        assertEquals(sol.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))), List.of(1, 3, 2));
        assertEquals(sol.inorderTraversal(null), new LinkedList<>());
        assertEquals(sol.inorderTraversal(new TreeNode(1)), List.of(1));
        assertEquals(sol.inorderTraversal(new TreeNode(1, new TreeNode(2), null)), List.of(2, 1));
        assertEquals(sol.inorderTraversal(new TreeNode(1, null, new TreeNode(2))), List.of(1, 2));
    }
}