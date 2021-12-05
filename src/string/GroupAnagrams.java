package string;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (int i = 0; i < strs.length; ++i) {
			char ch[] = strs[i].toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			if (!map.containsKey(s))
				map.put(s, new ArrayList<String>());
			map.get(s).add(strs[i]);
		}
		return new ArrayList<>(map.values());
	}
}

//Time Complexity T(n) = O(n) (For the for loop) * O(nlong) (For sorting)
//                T(n) = O(n)*O(nlogn)