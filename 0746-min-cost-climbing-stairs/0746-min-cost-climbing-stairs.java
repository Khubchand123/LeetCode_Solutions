class Solution {
    // int solve(int[] cost,int i,int[] arr){
    //     if(i==0){
    //         return cost[0];
    //     }
    //     if(i==1){
    //         return cost[1];
    //     }
    //     if(arr[i]!=0){
    //         return arr[i];
    //     }
    //     arr[i]=cost[i]+Math.min(solve(cost,i-1,arr),solve(cost,i-2,arr));
    //     return arr[i];
    // }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
           // 1. recursive Approach TC:O(n) SC:O(2*n)
        // int arr[] = new int[n];
        // int ans = Math.min(solve(cost,n-1,arr),solve(cost,n-2,arr));
        // return ans;
        
           // 2. Iterative approach TC:O(n) SC:O(n)
         
//         int dp[] = new int[n+1];
//         dp[0] = cost[0];
//         dp[1] = cost[1];
        
//         for(int i=2;i<n;i++){
//             dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
//         }
//         return Math.min(dp[n-1],dp[n-2]);
        
                // 3. two varaiable approach
        
        int prev0 = cost[0];
        int prev1 = cost[1];
        for(int i=2;i<n;i++){
            int temp = cost[i]+Math.min(prev0,prev1);
            
            prev0 = prev1;
            
            prev1 = temp;
        }
        
        return Math.min(prev0,prev1);
    }
}