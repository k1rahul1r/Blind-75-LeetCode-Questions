package array;

//https://leetcode.com/problems/two-sum/
import java.util.*;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; ++i) {
			int rem = target - nums[i];
			if (map.containsKey(rem))
				return new int[] { map.get(rem), i };
			else
				map.put(nums[i], i);
		}
		return null;
	}
}

//Time Complexity T(n) = O(n)