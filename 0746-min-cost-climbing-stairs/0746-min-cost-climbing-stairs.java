class Solution {
    int solve(int[] cost,int i,int[] arr){
        if(i==0){
            return cost[0];
        }
        if(i==1){
            return cost[1];
        }
        if(arr[i]!=0){
            return arr[i];
        }
        arr[i]=cost[i]+Math.min(solve(cost,i-1,arr),solve(cost,i-2,arr));
        return arr[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int arr[] = new int[n];
        int ans = Math.min(solve(cost,n-1,arr),solve(cost,n-2,arr));
        return ans;
    }
}