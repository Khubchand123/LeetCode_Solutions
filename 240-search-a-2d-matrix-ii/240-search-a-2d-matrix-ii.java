class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix[i].length;
            int mid=(left+right)/2;
            while(left<right){
                if(matrix[i][mid]==target){
                    return true;
                }
                else if(matrix[i][mid]<target){
                    left=mid;
                }
                else{
                    right=mid;
                }
                if(mid==(left+right)/2){
                    break;
                }
                mid=(left+right)/2;
            }
        }
        return false;
    }
}