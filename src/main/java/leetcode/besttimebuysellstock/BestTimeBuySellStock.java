package leetcode.besttimebuysellstock;

public class BestTimeBuySellStock {

	public int maxProfit(final int[] ints) {
		int minPrice = ints[0];
		int maxProfit = 0;
		for (int price : ints) {
			minPrice = Math.min(price, minPrice);
			maxProfit = Math.max(maxProfit, price - minPrice);
		}
		return maxProfit;
	}

}

