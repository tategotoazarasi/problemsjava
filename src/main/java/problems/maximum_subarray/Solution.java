package problems.maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int start = -1;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                start = i;
                break;
            }
            max = Math.max(max, nums[i]);
        }
        if (start == -1) {
            return max;
        }

        max = nums[start];
        int cur = 0;
        for (int i = start; i < nums.length; i++) {
            if (cur < 0) {
                cur = nums[i];
            } else {
                cur += nums[i];
            }
            max = Math.max(cur, max);
        }
        return max;
    }
}