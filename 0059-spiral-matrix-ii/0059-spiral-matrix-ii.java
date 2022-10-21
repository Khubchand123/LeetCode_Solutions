class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int maxR=n-1;
        int minR=0;
        int maxC=n-1;
        int minC=0;
        int total=n*n;
        int count=1;
        while(count<=total){
            for(int i=minC;i<=maxC && count <= total;i++){
                matrix[minR][i]=count++;
            }
            minR++;
            for(int i=minR;i<=maxR && count <= total;i++){
                matrix[i][maxC]=count++;
            }
            maxC--;
            for(int i=maxC;i>=minC && count <= total;i--){
                matrix[maxR][i]=count++;
            }
            maxR--;
            for(int i=maxR;i>=minR && count <= total;i--){
                matrix[i][minC]=count++;
            }
            minC++;
        }
        return matrix;
    }
}