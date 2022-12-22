package leetcode.binary_tree_cameras;

import leetcode.common.TreeNode;

import java.util.HashMap;

/**
 * 968. 监控二叉树
 */
public class Solution {
	HashMap<TreeNode, Integer> m0 = new HashMap<>();
	HashMap<TreeNode, Integer> m1 = new HashMap<>();

	public int minCameraCover(TreeNode root) {
		return minCameraCover0(root);
	}

	public int minCameraCover0(TreeNode root) {
		if (m0.containsKey(root)) {
			return m0.get(root);
		}
		int ans;
		if (root.left == null && root.right == null) {
			ans = 1;
		} else if (root.left != null && root.right == null) {
			ans =
					Math.min(1 + minCameraCover1(root.left),
					         1 +
					         (root.left.left == null ?
					          0 :
					          minCameraCover1(root.left.left)) +
					         (root.left.right == null ?
					          0 :
					          minCameraCover1(root.left.right)));
		} else if (root.left == null && root.right != null) {
			ans =
					Math.min(1 + minCameraCover1(root.right),
					         1 +
					         (root.right.left == null ?
					          0 :
					          minCameraCover1(root.right.left)) +
					         (root.right.right == null ?
					          0 :
					          minCameraCover1(root.right.right)));
		} else {
			ans =
					Math.min(1 + minCameraCover1(root.left) + minCameraCover1(root.right), Math.min(1 +
					                                                                                (root.left.left ==
					                                                                                 null ?
					                                                                                 0 :
					                                                                                 minCameraCover1(
							                                                                                 root.left.left)) +
					                                                                                (root.left.right ==
					                                                                                 null ?
					                                                                                 0 :
					                                                                                 minCameraCover1(
							                                                                                 root.left.right)) +
					                                                                                minCameraCover0(root.right),
					                                                                                1 +
					                                                                                (root.right.left ==
					                                                                                 null ?
					                                                                                 0 :
					                                                                                 minCameraCover1(
							                                                                                 root.right.left)) +
					                                                                                (root.right.right ==
					                                                                                 null ?
					                                                                                 0 :
					                                                                                 minCameraCover1(
							                                                                                 root.right.right)) +
					                                                                                minCameraCover0(root.left)));
		}
		m0.put(root, ans);
		return ans;
	}

	public int minCameraCover1(TreeNode root) {
		if (m1.containsKey(root)) {
			return m1.get(root);
		}
		int ans;
		if (root.left == null && root.right == null) {
			ans = 0;
		} else if (root.left != null && root.right == null) {
			ans = Math.min(1 + minCameraCover1(root.left), minCameraCover0(root.left));
		} else if (root.left == null && root.right != null) {
			ans = Math.min(1 + minCameraCover1(root.right), minCameraCover0(root.right));
		} else {
			ans =
					Math.min(1 + minCameraCover1(root.left) + minCameraCover1(root.right),
					         minCameraCover0(root.left) + minCameraCover0(root.right));
		}
		m1.put(root, ans);
		return ans;
	}
}