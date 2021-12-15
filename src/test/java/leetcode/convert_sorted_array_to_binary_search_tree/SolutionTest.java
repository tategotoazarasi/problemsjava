package leetcode.convert_sorted_array_to_binary_search_tree;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sortedArrayToBST() {
        Solution sol = new Solution();
        TreeNode res1 = sol.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(res1);

        TreeNode res2 = sol.sortedArrayToBST(new int[]{1, 3});
        System.out.println(res2);
    }
}