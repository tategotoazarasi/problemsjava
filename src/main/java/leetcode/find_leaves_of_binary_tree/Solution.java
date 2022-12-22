package leetcode.find_leaves_of_binary_tree;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 366. 寻找二叉树的叶子节点
 */
public class Solution {
	List<List<Integer>> ans = new ArrayList<>();

	public List<List<Integer>> findLeaves(TreeNode root) {
		while (!isLeaf(root)) {
			ans.add(new ArrayList<>());
			dfs(root);
		}
		List<Integer> lst = new ArrayList<>();
		lst.add(root.val);
		ans.add(lst);
		return ans;
	}

	private void dfs(TreeNode node) {
		if (node.left != null) {
			if (isLeaf(node.left)) {
				ans.get(ans.size() - 1).add(node.left.val);
				node.left = null;
			} else {
				dfs(node.left);
			}
		}
		if (node.right != null) {
			if (isLeaf(node.right)) {
				ans.get(ans.size() - 1).add(node.right.val);
				node.right = null;
			} else {
				dfs(node.right);
			}
		}
	}

	private boolean isLeaf(TreeNode node) {
		return node.left == null && node.right == null;
	}
}