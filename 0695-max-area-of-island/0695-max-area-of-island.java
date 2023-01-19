class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count=0;
                    helper(grid,i,j);
                    ans = Math.max(ans,count);
                    count=0;
                }
            }
        }
        return ans;
    }
    static int count;
    public static void helper(int[][] grid,int sr,int sc){
        if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc]==0){
            return;
        }
        count++;
        grid[sr][sc] = 0;
        helper(grid,sr+1,sc);
        helper(grid,sr-1,sc);
        helper(grid,sr,sc+1);
        helper(grid,sr,sc-1);
    }
}