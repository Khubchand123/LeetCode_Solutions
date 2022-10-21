class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;
        int maxR=m-1;
        int minR=0;
        int maxC=n-1;
        int minC=0;
        int total=m*n;
        int count=0;
        List<Integer> obj = new ArrayList<>();
        while(count<total){
            for(int i=minC;i<=maxC && count < total;i++){
                obj.add(matrix[minR][i]);
                count++;
            }
            minR++;
            for(int i=minR;i<=maxR && count < total;i++){
                obj.add(matrix[i][maxC]);
                count++;
            }
            maxC--;
            for(int i=maxC;i>=minC && count < total;i--){
                obj.add(matrix[maxR][i]);
                count++;
            }
            maxR--;
            for(int i=maxR;i>=minR && count < total;i--){
                obj.add(matrix[i][minC]);
                count++;
            }
            minC++;
        }
        return obj;
    }
}