package leetcode.path_sum;

import leetcode.common.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return DFS(root, targetSum, 0);
    }

    private boolean DFS(TreeNode node, int targetsum, int currentsum) {
        if (node.left == null && node.right == null) {
            return targetsum == currentsum + node.val;
        }
        return (node.left != null && DFS(node.left, targetsum, currentsum + node.val)) || (node.right != null && DFS(node.right, targetsum, currentsum + node.val));
    }
}