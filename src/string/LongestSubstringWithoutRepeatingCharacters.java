//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		String maxString = "";
		int max = 0;
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			int index = maxString.indexOf(ch);
			if (index != -1)
				maxString = maxString.substring(index + 1);

			maxString += ch;
			max = Math.max(max, maxString.length());
		}
		return max;
	}
}
//Time Complexity T(n) = O(n^2)