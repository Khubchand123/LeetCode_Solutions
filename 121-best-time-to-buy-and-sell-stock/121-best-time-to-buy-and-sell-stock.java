class Solution {
    public int maxProfit(int[] prices) {
    // 1. solution using arr
        // int n = prices.length;
        // int arr[] = new int[n];
        // arr[n-1]=prices[n-1];
        // int max=0;
        // for(int i=n-2;i>=0;i--){
        //     if(prices[i]>arr[i+1]){
        //         arr[i]=prices[i];
        //     }
        //     else{
        //         arr[i]=arr[i+1];
        //     }
        //     max=Math.max(arr[i]-prices[i],max);
        // }
        // return max;
        
    // 2. solution without using arr
        
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            maxprofit=Math.max(prices[i]-minprice,maxprofit);
        }
        return maxprofit;
        
    }
}