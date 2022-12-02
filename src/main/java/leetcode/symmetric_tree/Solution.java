package leetcode.symmetric_tree;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		reverse(root.left);
		return isSameTree(root.left, root.right);
	}

	private boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		return isSameTree(p.left, q.left) && p.val == q.val && isSameTree(p.right, q.right);
	}

	private void reverse(TreeNode node) {
		if (node == null) {
			return;
		} else if (node.left == null && node.right != null) {
			node.left  = node.right;
			node.right = null;
		} else if (node.right == null && node.left != null) {
			node.right = node.left;
			node.left  = null;
		} else {
			TreeNode temp = node.left;
			node.left  = node.right;
			node.right = temp;
		}
		if (node.left != null) {
			reverse(node.left);
		}
		if (node.right != null) {
			reverse(node.right);
		}
	}
}