package problems.remove_duplicates_from_sorted_array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int ret = nums.length;
        for (int i = 0; i < ret; i++) {
            int j = i + 1;
            while (j < ret) {
                if (nums[i] == nums[j]) {
                    j++;
                } else {
                    break;
                }
            }
            for (int k = 0; i + k + 1 < nums.length; k++) {
                nums[i + k + 1] = nums[Math.min(j + k, nums.length - 1)];
            }
            ret -= j - i - 1;
        }
        return ret;
    }
}