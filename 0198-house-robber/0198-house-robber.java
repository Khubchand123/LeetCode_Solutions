class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        
        int dp[] = new int[nums.length];
        dp[0]=nums[0];
        if(nums[1]>nums[0]){
            dp[1]=nums[1];
        }
        else{
            dp[1]=nums[0];
        }
        for(int i=2;i<dp.length;i++){
            if(nums[i]+dp[i-2]>dp[i-1]){
                dp[i]=nums[i]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1];
            }
        }
        return dp[n-1];
    }
}