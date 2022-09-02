class Solution {
    public void rotate(int[][] matrix) {
        
        int m=matrix.length;
        int[][] dp = new int[m][m];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=matrix[m-1-j][i];
            }
        }
    
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=dp[i][j];
            }
        }
    }
}