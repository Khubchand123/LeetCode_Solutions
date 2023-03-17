class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                convert(board,m,n,i,0);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O'){
                convert(board,m,n,i,n-1);
            }
        }
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                convert(board,m,n,0,i);
            }
        }
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O'){
                convert(board,m,n,m-1,i);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='Y'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void convert(char[][] board,int m,int n,int i,int j){
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]=='Y'){
            return;
        }
        if(board[i][j]=='O'){
        board[i][j]='Y';
        convert(board,m,n,i+1,j);
        convert(board,m,n,i-1,j);
        convert(board,m,n,i,j+1);
        convert(board,m,n,i,j-1);
        }
    }
}