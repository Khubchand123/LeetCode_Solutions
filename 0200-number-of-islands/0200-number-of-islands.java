class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(visited,i,j,grid);
                    count++;
                }
            }
            
        }
        return count;
    }
    void dfs(boolean[][] visited,int i,int j,char[][] grid){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(visited,i+1,j,grid);
        dfs(visited,i-1,j,grid);
        dfs(visited,i,j+1,grid);
        dfs(visited,i,j-1,grid);
    }
    
}