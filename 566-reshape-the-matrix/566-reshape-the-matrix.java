class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        int row=0;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[row][count++]=mat[i][j];
                if(count==c){
                    count=0;
                    row++;
                }
            }
        }
        return ans;
    }
}