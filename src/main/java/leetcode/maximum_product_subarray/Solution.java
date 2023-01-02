package leetcode.maximum_product_subarray;

/**
 * 152. 乘积最大子数组
 */
public class Solution {
	public int maxProduct(int[] nums) {
		int[] dplMax = new int[nums.length];   // 以i为左端点的最大乘积
		int[] dprMax = new int[nums.length];   // 以i为右端点的最大乘积
		int[] dplMin = new int[nums.length];   // 以i为左端点的最小乘积
		int[] dprMin = new int[nums.length];   // 以i为右端点的最小乘积
		dplMax[nums.length - 1] = nums[nums.length - 1];
		dplMin[nums.length - 1] = nums[nums.length - 1];
		dprMax[0]               = nums[0];
		dprMin[0]               = nums[0];
		for (int i = nums.length - 2; i >= 0; i--) {
			dplMax[i] = Math.max(nums[i], Math.max(nums[i] * dplMax[i + 1], nums[i] * dplMin[i + 1]));
			dplMin[i] = Math.min(nums[i], Math.min(nums[i] * dplMax[i + 1], nums[i] * dplMin[i + 1]));
		}
		for (int i = 1; i < nums.length; i++) {
			dprMax[i] = Math.max(nums[i], Math.max(nums[i] * dprMax[i - 1], nums[i] * dprMin[i - 1]));
			dprMin[i] = Math.min(nums[i], Math.min(nums[i] * dprMax[i - 1], nums[i] * dprMin[i - 1]));
		}
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			ans = Math.max(ans, Math.max(dprMax[i], dplMax[i]));
		}
		return ans;
	}
}