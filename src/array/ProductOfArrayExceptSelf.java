package array;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int answer[] = new int[nums.length];
		int leftProd = 1;
		int rightProd = 1;
		for (int i = 0; i < nums.length; ++i) {
			answer[i] = leftProd;
			leftProd *= nums[i];
		}
		for (int i = nums.length - 1; i >= 0; --i) {
			answer[i] *= rightProd;
			rightProd *= nums[i];
		}
		return answer;
	}
}

//Time Complexity T(n) = O(n) + O(n) 
//                     = O(n)