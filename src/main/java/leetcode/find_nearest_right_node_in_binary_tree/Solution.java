package leetcode.find_nearest_right_node_in_binary_tree;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1602. 找到二叉树中最近的右侧节点
 */
public class Solution {
	public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
		Queue<Pair<Integer, TreeNode>> q     = new LinkedList<>();
		boolean                        flag  = false;
		int                            level = -1;
		q.add(new Pair<>(0, root));
		while (!q.isEmpty()) {
			Pair<Integer, TreeNode> p = q.remove();
			if (p.second == u) {
				flag  = true;
				level = p.first;
			} else if (flag) {
				if (p.first == level) {
					return p.second;
				} else {
					return null;
				}
			}
			if (p.second.left != null) {
				q.add(new Pair<>(p.first + 1, p.second.left));
			}
			if (p.second.right != null) {
				q.add(new Pair<>(p.first + 1, p.second.right));
			}
		}
		return null;
	}

	private class Pair<T, E> {
		public T first;
		public E second;

		public Pair(T t, E e) {
			first  = t;
			second = e;
		}
	}
}