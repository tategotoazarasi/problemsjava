package leetcode.binary_tree_postorder_traversal;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new LinkedList<>();
        if (root == null) {
            return ret;
        }
        if (root.left != null) {
            ret.addAll(postorderTraversal(root.left));
        }
        if (root.right != null) {
            ret.addAll(postorderTraversal(root.right));
        }
        ret.add(root.val);
        return ret;
    }
}