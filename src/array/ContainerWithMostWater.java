package array;

//https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int maxWater = 0, left = 0, right = height.length - 1;
		while (left < right) {
			maxWater = Math.max(maxWater, (right - left) * Math.min(height[left], height[right]));
			if (height[left] > height[right])
				--right;
			else
				++left;
		}
		return maxWater;
	}
}

//Time Complexity T(n) = O(n)