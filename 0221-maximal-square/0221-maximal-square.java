class Solution {
    int max;
    int solve(char[][] matrix,int[][] dp,int i,int j){
        if(i>=matrix.length || j>=matrix[0].length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = solve(matrix,dp,i+1,j);
        int diag = solve(matrix,dp,i+1,j+1);
        int right = solve(matrix,dp,i,j+1);
        
        if(matrix[i][j]=='1'){
            dp[i][j] = 1+Math.min(down,Math.min(right,diag));
            max = Math.max(max,dp[i][j]);
            return dp[i][j];
        }
        else{
            dp[i][j]=0;
            return 0;
        }
    }
    public int maximalSquare(char[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }
        max = 0;
        solve(matrix,dp,0,0);
        return max*max;
    }
}