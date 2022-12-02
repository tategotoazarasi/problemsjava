package leetcode.binary_tree_inorder_traversal;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return new LinkedList<>();
		}
		List<Integer> list = new LinkedList<>();
		if (root.left != null) {
			list.addAll(inorderTraversal(root.left));
		}
		list.add(root.val);
		if (root.right != null) {
			list.addAll(inorderTraversal(root.right));
		}
		return list;
	}
}