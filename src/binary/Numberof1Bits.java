//https://leetcode.com/problems/number-of-1-bits/
public class Numberof1Bits {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int ones = 0;
		while (n != 0) {
			ones += (n & 1);
			n = n >>> 1;
		}
		return ones;
	}
}
