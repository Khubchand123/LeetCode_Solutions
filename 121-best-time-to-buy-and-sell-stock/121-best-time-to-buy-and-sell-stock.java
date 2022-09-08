class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int arr[] = new int[n];
        arr[n-1]=prices[n-1];
        int max=0;
        for(int i=n-2;i>=0;i--){
            if(prices[i]>arr[i+1]){
                arr[i]=prices[i];
            }
            else{
                arr[i]=arr[i+1];
            }
            max=Math.max(arr[i]-prices[i],max);
       }
        return max;
    }
}