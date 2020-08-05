class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // Get Present Max Profit 
        for(int p : prices) {
            if(p < minPrice ) minPrice = p;
            else if(p - minPrice > maxProfit) maxProfit = p-minPrice;
        }
        return maxProfit;
    }
}
