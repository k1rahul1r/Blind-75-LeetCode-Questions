package string;

//https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int left = 0, right = str.length() - 1;
		System.out.println(str);
		while (left < right) {
			if (str.charAt(left) != str.charAt(right))
				return false;
			++left;
			--right;
		}
		return true;
	}
}

//Time Complexity T(n) = O(N/2);