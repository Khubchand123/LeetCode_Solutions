class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        String s="";
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    s+=Integer.toString(i);
                    s+=" ";
                    s+=Integer.toString(j);
                    s+=" ";
                    
                }
            }
        }
        String arr[] = s.split(" ");
        for(int i=0;i<arr.length-1;i+=2){
            int a=Integer.parseInt(arr[i]);
            int b=Integer.parseInt(arr[i+1]);
            for(int j=a;j<m;j++){
                matrix[j][b]=0;
            
            }
            for(int j=b;j>=0;j--){
                matrix[a][j]=0;
              
            }
            for(int j=a;j>=0;j--){
                matrix[j][b]=0;
                
            }
            for(int j=b;j<n;j++){
                matrix[a][j]=0;
                
            }
            
        }
    }
}