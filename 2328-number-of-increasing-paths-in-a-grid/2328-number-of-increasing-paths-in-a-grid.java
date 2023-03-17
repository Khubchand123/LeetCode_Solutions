class Solution {
    int mod = 1000000007;
    public int countPaths(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans = (ans+helper(matrix,dp,m,n,i,j))%mod;
            }
        }
        return ans;
    }
    int helper(int[][] matrix,int[][] dp,int m,int n, int i,int j){
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        long ans = 0;
        int k = matrix[i][j];
        if(i+1<m && matrix[i+1][j]>k){
            ans=(ans+helper(matrix,dp,m,n,i+1,j))%mod;
        }
        if(i-1>=0 && matrix[i-1][j]>k){
            ans=(ans+helper(matrix,dp,m,n,i-1,j))%mod;
        }
        if(j+1<n && matrix[i][j+1]>k){
            ans=(ans+helper(matrix,dp,m,n,i,j+1))%mod;
        }
        if(j-1>=0 && matrix[i][j-1]>k){
            ans=(ans+helper(matrix,dp,m,n,i,j-1))%mod;
        }
        dp[i][j] =(int) (ans+1)%mod;
        return dp[i][j];
    }
}