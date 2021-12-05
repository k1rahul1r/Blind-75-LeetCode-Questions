package array;
//https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; ++i) {
			sum += nums[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0)
				sum = 0;
		}
		return maxSum;
	}
}

//Time Complexity T(n) = O(n)