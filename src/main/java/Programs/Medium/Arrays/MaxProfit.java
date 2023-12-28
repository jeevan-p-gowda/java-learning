package Programs.Medium.Arrays;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // No profit can be made with less than two prices
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {5, 2, 3, 10, 6, 4, 8, 1};
        int maxProfit = maxProfit(prices);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
