package leetcode.balanced_binary_tree;

import leetcode.common.TreeNode;

public class Solution {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int ldepth = 0;
		int rdepth = 0;
		try {
			if (root.left != null) {
				ldepth = getDepth(root.left);
			}
			if (root.right != null) {
				rdepth = getDepth(root.right);
			}
		} catch (NotBalancedBinaryTreeException e) {
			return false;
		}
		return Math.abs(ldepth - rdepth) <= 1;
	}

	private int getDepth(TreeNode node) throws NotBalancedBinaryTreeException {
		int depth  = 0;
		int ldepth = 0;
		int rdepth = 0;
		if (node.left != null) {
			ldepth = getDepth(node.left);
		}
		if (node.right != null) {
			rdepth = getDepth(node.right);
		}
		if (Math.abs(ldepth - rdepth) > 1) {
			throw new NotBalancedBinaryTreeException();
		}
		return Math.max(ldepth, rdepth) + 1;
	}

	private static class NotBalancedBinaryTreeException extends Exception {

	}
}