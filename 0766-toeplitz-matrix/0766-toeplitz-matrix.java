class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int p=0;
        while(i<n-1){
            int k=0;
            int j=p;
            while(k<m-1 && j<n-1){
                if(matrix[k][j]!=matrix[k+1][j+1]){
                    return false;
                }
                k++;
                j++;
            }
            p++;
            i++;
        }
        i=1;
        p=0;
        while(i<m-1){
            int k=i;
            int j=0;
            while(k<m-1 && j<n-1){
                if(matrix[k][j]!=matrix[k+1][j+1]){
                    return false;
                }
                k++;
                j++;
            }
            p++;
            i++;
        }
        return true;
    }
}