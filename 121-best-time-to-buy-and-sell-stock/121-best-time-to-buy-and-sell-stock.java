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
            if(arr[i]-prices[i]>max){
                max=arr[i]-prices[i];
            }
       }
        // int max=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]-prices[i]>max){
        //         max=arr[i]-prices[i];
        //     }
        // }
        
        
        return max;
    }
}