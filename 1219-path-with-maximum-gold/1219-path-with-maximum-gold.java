class Solution {
    public int getMaximumGold(int[][] grid) {
       int m = grid.length;
        int n = grid[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    max = Math.max(max,helper(grid,m,n,i,j,new boolean[m][n]));
                }
            }
        }
        return max;
            
    }
    int helper(int[][] grid,int m,int n,int i,int j,boolean[][] vis){
        if(i<0 || j<0 || i>=m || j>=n ){
            return 0;
        }
        if(grid[i][j]==0 || vis[i][j]){
            return 0;
        }
        vis[i][j] = true;
        // boolean ans = true;
        int a = helper(grid,m,n,i+1,j,vis);
        int b = helper(grid,m,n,i-1,j,vis);
        int c = helper(grid,m,n,i,j+1,vis);
        int d = helper(grid,m,n,i,j-1,vis);
        vis[i][j] = false;
        return Math.max(Math.max(a,b),Math.max(c,d))+grid[i][j];
        
    }
}