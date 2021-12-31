//https://leetcode.com/problems/missing-number/
public class MissingNumber {
	public int missingNumber(int[] nums) {
		int xor = 0, i = 0;
		for (i = 0; i < nums.length; ++i)
			xor ^= i ^ nums[i];
		return xor ^ i;
	}
}
//Time Complexity T(n) = O(n)