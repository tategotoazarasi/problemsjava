package leetcode.minimum_depth_of_binary_tree;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 1;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left == null && node.right == null) {
                return node.val;
            }
            if (node.left != null) {
                node.left.val = node.val + 1;
                queue.add(node.left);
            }
            if (node.right != null) {
                node.right.val = node.val + 1;
                queue.add(node.right);
            }
        }
        return 0;
    }
}