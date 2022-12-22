package leetcode.binary_tree_maximum_path_sum;

import leetcode.common.TreeNode;

/**
 * 124. 二叉树中的最大路径和
 */
public class Solution {
	private int ans = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		getMaxVal(root);
		return ans;
	}

	private int getMaxVal(TreeNode node) {
		int val = node.val;
		ans = Math.max(ans, val);
		int left  = 0;
		int right = 0;
		if (node.left != null) {
			left = getMaxVal(node.left);
			ans  = Math.max(ans, val + left);
		}
		if (node.right != null) {
			right = getMaxVal(node.right);
			ans   = Math.max(ans, val + right);
		}
		if (node.left != null && node.right != null) {
			ans = Math.max(ans, val + right + left);
		}
		val = Math.max(val, Math.max(val + left, val + right));
		return val;
	}
}