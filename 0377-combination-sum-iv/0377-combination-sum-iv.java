class Solution {
    public int solve(int[] nums,int[] dp,int target){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=solve(nums,dp,target-nums[i]);
        }
        dp[target] = ans;
        return ans;
    }
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target+1];
        Arrays.fill(dp,-1);
        return solve(nums,dp,target);
    }
}