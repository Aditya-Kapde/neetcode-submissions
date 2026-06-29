class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Keep track of the lowest price
            maxProfit = Math.max(maxProfit, price - minPrice); // Check profit if sold today
        }

        return maxProfit;
    }
}
