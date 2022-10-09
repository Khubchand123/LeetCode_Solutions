class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int pem=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(j==0){
                        pem+=1;
                    }
                    else  if(grid[i][j-1]!=1){
                        pem+=1;
                    }
                    if(i==0){
                        pem+=1;
                    }
                    else if(grid[i-1][j]!=1){
                        pem+=1;
                    }
                    if(i==m-1){
                        pem+=1;
                    }
                    else  if(grid[i+1][j]!=1){
                        pem+=1;
                    }
                    if(j==n-1){
                        pem+=1;
                    }
                    else if(grid[i][j+1]!=1){
                        pem+=1;
                    }
                   
                    
                   
                }
            }
        }
        return pem;
    }
}