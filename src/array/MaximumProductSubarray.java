package array;
//https://leetcode.com/problems/maximum-product-subarray/

public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int min = nums[0], max = nums[0], ans = nums[0];
		for (int i = 1; i < nums.length; ++i) {
			int temp = max;
			max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
			min = Math.min(Math.min(nums[i] * temp, nums[i] * min), nums[i]);
			ans = Math.max(max, ans);
		}
		return ans;
	}
}

//Time Complexity T(n) = O(n)