package leetcode.binary_tree_preorder_traversal;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ret = new LinkedList<>();
		if (root == null) {
			return ret;
		}
		ret.add(root.val);
		ret.addAll(preorderTraversal(root.left));
		ret.addAll(preorderTraversal(root.right));
		return ret;
	}
}