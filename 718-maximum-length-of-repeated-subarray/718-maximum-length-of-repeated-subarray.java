class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int dp[][] = new int[m+1][n+1];
        int max=0;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=0;
                }
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}