//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {
	int maxLength = 0, start = 0, end = 1;

	public String longestPalindrome(String s) {
		int len = s.length();
		if (len == 1)
			return s;

		for (int i = 0; i < len; ++i) {
			checkPalindrome(s, i, i);
			checkPalindrome(s, i, i + 1);
		}
		return s.substring(start, end);
	}

	public void checkPalindrome(String s, int low, int high) {
		while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
			--low;
			++high;
		}

		if (maxLength <= high - low - 1) {
			maxLength = high - low - 1;
			start = ++low;
			end = high;
		}
	}

}
//Time Complexity T(n) = O(n^3)