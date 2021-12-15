package leetcode.maximum_depth_of_binary_tree;

import java.util.Objects;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null && root.right != null) {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        return maxDepth(Objects.requireNonNullElseGet(root.left, () -> root.right)) + 1;
    }
}