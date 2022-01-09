package src.dynamicProgramming;
//https://leetcode.com/problems/combination-sum-iv/
public class CombinationSumIV {
	public int combinationSum4(int[] nums, int target) {
	       Arrays.sort(nums);
	       int dp[] = new int[target+1];
	       dp[0]=1;
	       for(int i=1;i<=target;++i){
	           for(int num:nums){
	               if(i >= num)
	                   dp[i]+=dp[i-num];
	               else break;
	           }
	       }
	       return dp[target];
	    }
}
//Time Complexity T(n) = O(n*k)