package leetcode.merge_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void merge() {
        Solution sol = new Solution();

        int[] case1_nums1 = new int[]{1, 2, 3, 0, 0, 0};
        sol.merge(case1_nums1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, case1_nums1);

        int[] case1_nums2 = new int[]{1};
        sol.merge(case1_nums2, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, case1_nums2);

        int[] case1_nums3 = new int[]{0};
        sol.merge(case1_nums3, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, case1_nums3);

        int[] case1_nums4 = new int[]{2, 0};
        sol.merge(case1_nums4, 1, new int[]{1}, 1);
        assertArrayEquals(new int[]{1, 2}, case1_nums4);
    }
}