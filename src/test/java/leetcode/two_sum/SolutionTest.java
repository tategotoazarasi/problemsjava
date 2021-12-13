package leetcode.two_sum;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest extends TestCase {

    @Test
    void twoSum() {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = {0, 1};
        int[] res = sol.twoSum(nums, target);
        assertArrayEquals(ans, res);
    }
}