class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int m=mat.length;
        int i=0;
        while(i<m){
            sum+=mat[i][i];
            sum+=mat[m-i-1][i];
            i++;
        }
        if(m%2!=0){
            sum-=mat[m/2][m/2];
        }
        return sum;
    }
}