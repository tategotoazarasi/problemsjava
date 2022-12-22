package leetcode.diameter_of_n_ary_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 1522. N 叉树的直径
 */
public class Solution {
	private int res = 0;

	public int diameter(Node root) {
		maxDepth(root);
		return res;
	}

	private int maxDepth(Node node) {
		int ans  = 0;
		int max1 = 0;
		int max2 = 0;
		for (Node child : node.children) {
			int depth = 1 + maxDepth(child);
			if (depth >= max1) {
				max2 = max1;
				max1 = depth;
			} else if (depth >= max2) {
				max2 = depth;
			}
			ans = Math.max(ans, depth);
		}
		res = Math.max(res, max1 + max2);
		return ans;
	}

	private class Node {
		public int        val;
		public List<Node> children;


		public Node() {
			children = new ArrayList<Node>();
		}

		public Node(int _val) {
			val      = _val;
			children = new ArrayList<Node>();
		}

		public Node(int _val, ArrayList<Node> _children) {
			val      = _val;
			children = _children;
		}
	}
}
