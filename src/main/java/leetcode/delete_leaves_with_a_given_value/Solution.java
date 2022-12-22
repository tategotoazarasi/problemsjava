package leetcode.delete_leaves_with_a_given_value;

import leetcode.common.TreeNode;

/**
 * 1325. 删除给定值的叶子节点
 */
public class Solution {
	public TreeNode removeLeafNodes(TreeNode root, int target) {
		remove(root, target);
		if (isLeaf(root) && root.val == target) {
			return null;
		} else {
			return root;
		}
	}

	private void remove(TreeNode root, int target) {
		if (root.left != null) {
			remove(root.left, target);
			if (isLeaf(root.left) && root.left.val == target) {
				root.left = null;
			}
		}
		if (root.right != null) {
			remove(root.right, target);
			if (isLeaf(root.right) && root.right.val == target) {
				root.right = null;
			}
		}
	}

	private boolean isLeaf(TreeNode node) {
		return node.left == null && node.right == null;
	}
}
