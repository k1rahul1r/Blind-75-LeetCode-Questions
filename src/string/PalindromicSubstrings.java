//https://leetcode.com/problems/palindromic-substrings/
public class PalindromicSubstrings {
	public int countSubstrings(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); ++i) {
			ans += isPalindrome(s, i, i);
			if (i + 1 <= s.length())
				ans += isPalindrome(s, i, i + 1);
		}
		return ans;
	}

	public int isPalindrome(String s, int low, int high) {
		int count = 0;
		while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
			--low;
			++high;
			++count;
		}
		return count;
	}
}
//Time Complexity T(n) = O(n^3)