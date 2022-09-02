class Solution {
    public void rotate(int[][] matrix) {
        // int n = matrix.length;
        // for (int i = 0; i < (n + 1) / 2; i ++) {
        //     for (int j = 0; j < n / 2; j++) {
        //         int temp = matrix[n - 1 - j][i];
        //         matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
        //         matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
        //         matrix[j][n - 1 - i] = matrix[i][j];
        //         matrix[i][j] = temp;
        //     }
        // }
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