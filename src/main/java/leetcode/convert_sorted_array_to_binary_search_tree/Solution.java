package leetcode.convert_sorted_array_to_binary_search_tree;

import java.util.Arrays;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        if (nums.length == 2) {
            return new TreeNode(nums[0], null, new TreeNode(nums[1]));
        }
        if (nums.length == 3) {
            return new TreeNode(nums[1], new TreeNode(nums[0]), new TreeNode(nums[2]));
        }
        return new TreeNode(nums[nums.length / 2], sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2)), sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length)));
    }
}