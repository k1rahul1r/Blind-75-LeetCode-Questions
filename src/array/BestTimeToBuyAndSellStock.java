package array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int buyIndex = 0;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; ++i) {
			if (prices[i] < prices[buyIndex])
				buyIndex = i;
			else 
				maxProfit = Math.max(prices[i] - prices[buyIndex], maxProfit);
		}
		return maxProfit;
	}
}

//Time Complexity T(n) = O(n)