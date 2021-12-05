package array;

import java.util.*;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res;
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length - 2; ++i) {
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					set.add(Arrays.asList(nums[i], nums[left], nums[right]));
					++left;
					--right;
				} else if (sum < 0)
					++left;
				else
					--right;
			}
		}
		return res = new LinkedList<>(set);
	}
}

//Time Complexity T(n) = O(nlogn)(For Sorting) + O(n^2)(For for lop and while loop)
//                     = O(n^2);