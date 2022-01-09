package src.dynamicProgramming;

//https://leetcode.com/problems/word-break/
public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		int len = s.length(), max = 0;
		for (String word : wordDict)
			max = Math.max(max, word.length());

		boolean dp[] = new boolean[len + 1];
		dp[0] = true;
		for (int i = 0; i <= len; ++i) {
			for (int j = 0; j < i; ++j) {
				if (dp[j] && i - j <= max && wordDict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[len];
	}
}
//Time Complexity T(n) = O(n^2)