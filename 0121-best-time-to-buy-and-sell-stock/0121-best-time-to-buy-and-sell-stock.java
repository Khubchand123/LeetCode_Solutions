class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxprofit=0;
        
        for(int i=0;i<n;i++){
            min = Math.min(prices[i],min);
            int profit=prices[i]-min;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}