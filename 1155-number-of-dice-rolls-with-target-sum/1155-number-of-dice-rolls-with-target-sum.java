class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int modulo = 1000000007;
        int dp[][] = new int[n+1][target+1];
    
        for(int i=0;i<=n;i++){
            for(int j=0;j<=target;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(i==1){
                    if(j<=k) dp[i][j]=1;
                }
                else {
                    for(int face=1;face<=k;face++){
                        if(j-face>=0){
                            dp[i][j]=(dp[i][j]+dp[i-1][j-face])%modulo; 
                        }
                    }
                }
            }
        }
        
        return dp[n][target];
    }
}