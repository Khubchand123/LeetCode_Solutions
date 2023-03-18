class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j]){
                    if(detectCycle(grid,vis,m,n,i,j,-1,-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean detectCycle(char[][] grid,boolean[][] vis,int m,int n,int i,int j,int pi,int pj){
        if(vis[i][j]){
            return true;
        }
        vis[i][j]=true;
        if(i+1<m && i+1!=pi && grid[i+1][j]==grid[i][j] ){
            if(detectCycle(grid,vis,m,n,i+1,j,i,j)){
                return true;
            }
        }
        if(i-1>=0 && i-1!=pi && grid[i-1][j]==grid[i][j] ){
            if(detectCycle(grid,vis,m,n,i-1,j,i,j)){
                return true;
            }
        }
        if(j+1<n && j+1!=pj && grid[i][j+1]==grid[i][j] ){
            if(detectCycle(grid,vis,m,n,i,j+1,i,j)){
                return true;
            }
        }
        if(j-1>=0 && j-1!=pj && grid[i][j-1]==grid[i][j] ){
            if(detectCycle(grid,vis,m,n,i,j-1,i,j)){
                return true;
            }
        }
        return false;
    }
}