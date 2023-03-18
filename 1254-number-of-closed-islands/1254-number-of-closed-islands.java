class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(grid[i][j]==0  && check(grid,m,n,i,j)){
                    count++;
                }
            }
        }
        return count;
            
    }
    boolean check(int[][] grid,int m,int n,int i,int j){
        if(grid[i][j]==1 || grid[i][j]==-1){
            return true;
        }
        if(i==0 || j==0 || i==m-1 || j==n-1){
            return false;
        }
        grid[i][j] = -1;
        // boolean ans = true;
        boolean ans1 = check(grid,m,n,i+1,j);
        boolean ans2 = check(grid,m,n,i-1,j);
        boolean ans3 = check(grid,m,n,i,j+1);
        boolean ans4 = check(grid,m,n,i,j-1);
        return ans1 && ans2 && ans3 && ans4;
    }
}