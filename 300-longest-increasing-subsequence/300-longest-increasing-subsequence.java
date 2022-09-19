class Solution {
    public int lengthOfLIS(int[] nums) {
        // int i=0;
        if(nums.length==0){
            return 0;
        }
        
        int max=0;
        int ans=1;
        int dp[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            int j=0;
            while(j<i){
                if(nums[j]<nums[i]){
                    max=Math.max(dp[j],max);
                }
            j++;
                
            }
            dp[count++]=max+1;
            ans=Math.max(ans,dp[i]);
            max=0;
        }
        return ans;
    }
}