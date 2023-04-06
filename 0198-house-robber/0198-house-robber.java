class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp,0);
    }
    int helper(int nums[],int dp[],int idx){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans = Math.max(nums[idx]+helper(nums,dp,idx+2),helper(nums,dp,idx+1));
        return dp[idx]=ans;
    }
}