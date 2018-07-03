class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int start = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[start]) {
                start = i;
            }
            else if (prices[i] - prices[start] > max) {
                max = prices[i] - prices[start];
            }
        }
        return max;
    }
}