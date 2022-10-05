class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        
        // int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[matrix[i][j]-1]++;
                
            }
            for(int k:arr){
                if(k!=1){
                    return false;
                }
            }
        }
        for(int i=0;i<n;i++){
            
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                
                arr[matrix[j][i]-1]++;
            }
            for(int k:arr){
                if(k!=1){
                    return false;
                }
            }
        }
        return true;
    }
}