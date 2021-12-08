package problems.search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l != r) {
            if (l + 1 == r) {
                if (nums[l] == target) {
                    return l;
                } else if (nums[r] == target) {
                    return r;
                } else if (target > nums[r]) {
                    return r + 1;
                } else if (target < nums[l]) {
                    return l;
                } else {
                    return l + 1;
                }
            }
            int cursor = (l + r) / 2;
            int val = nums[cursor];
            if (val == target) {
                return cursor;
            } else if (val > target) {
                r = cursor;
            } else {
                l = cursor;
            }
        }
        if (nums[l] == target) {
            return l;
        } else if (target > nums[r]) {
            return r + 1;
        } else if (target < nums[l]) {
            return l;
        } else {
            return l + 1;
        }
    }
}