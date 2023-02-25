class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int arr[] = new int[n];
        int max=0;
        for(int i=n-1;i>=0;i--){
            arr[i] = max;
            max = Math.max(prices[i],max);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,arr[i]-prices[i]);
        }
        return ans;
    }
}