//https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int left = 0, max = 0, windowSize = 0;
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch) + 1);

			max = Math.max(max, map.get(ch));

			if (i - left + 1 - max > k) {
				ch = s.charAt(left++);
				map.put(ch, map.get(ch) - 1);
			}
			windowSize = Math.max(windowSize, i - left + 1);
		}
		return windowSize;
	}
}

//Time Complexity T(n) = O(n)