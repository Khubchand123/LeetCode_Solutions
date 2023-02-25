class Solution {
    int helper(int[] nums,int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[0];
        }
        int incl = helper(nums,n-2) + nums[n];
        int excl = helper(nums,n-1) + 0;
        
        return Math.max(incl,excl);
    }
    int helper(int[] nums,int[] dp,int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int incl = helper(nums,dp,n-2) + nums[n];
        int excl = helper(nums,dp,n-1) + 0;
        dp[n] = Math.max(incl,excl);
        return dp[n];
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
                // 1. Recursive Approach Brute force
        
        // return helper(nums,n-1);
        
                  // 2. Recursive Approach Best
        
        // int dp[] = new int[n];
        // Arrays.fill(dp,-1);
        // dp[0]=helper(nums,dp,n-1);
        // if(dp[n-1]==-1){
        //     return 0;
        // }
        // return dp[n-1];
        
                // 3. Iterative Approach
        
        // int[] dp = new int[n];
        // dp[0] = nums[0];
        // for(int i=1;i<n;i++){
        //     int incl = (i-2<0?0:dp[i-2]) + nums[i];
        //     int excl = dp[i-1] + 0;
        //     dp[i] = Math.max(incl,excl);
        // }
        // return dp[n-1];
        
                // 4. Two Varible Approach
        
        int prev1 = nums[0];
        int prev2 = 0;
        
        for(int i=1;i<n;i++){
            int incl = prev2 + nums[i];
            int excl = prev1 + 0;
            int ans = Math.max(incl,excl);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
}