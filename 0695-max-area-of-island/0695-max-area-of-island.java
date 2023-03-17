class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    ans = Math.max(ans,helper(grid,m,n,i,j));
                }
            }
        }
        return ans;
    }
    int helper(int[][] grid,int m,int n,int i,int j){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0){
            return 0;
        }
        int ans =1;
        grid[i][j]=0;
        ans+=helper(grid,m,n,i+1,j);
        ans+=helper(grid,m,n,i-1,j);
        ans+=helper(grid,m,n,i,j+1);
        ans+=helper(grid,m,n,i,j-1);
        return ans;
    }
}