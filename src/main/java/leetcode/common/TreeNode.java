package leetcode.common;

public class TreeNode {
    int val;
    leetcode.convert_sorted_array_to_binary_search_tree.TreeNode left;
    leetcode.convert_sorted_array_to_binary_search_tree.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, leetcode.convert_sorted_array_to_binary_search_tree.TreeNode left, leetcode.convert_sorted_array_to_binary_search_tree.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}