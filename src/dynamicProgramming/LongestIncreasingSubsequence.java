package src.dynamicProgramming;

//https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		int len = nums.length;
		if (len <= 1)
			return len;

		int dp[] = new int[len];
		Arrays.fill(dp, 1);
		int max = 1;

		for (int i = 1; i < len; ++i) {
			for (int j = 0; j <= i - 1; ++j) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], 1 + dp[j]);
				}
			}
			max = Math.max(max, dp[i]);
		}

		return max;
	}
}

//Time Complexity T(n) = O(n^2)