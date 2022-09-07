class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(!rowsandColumnCheck(board)){
            return false;
        }
        for(int i=0;i<9;i+=3){
            
            if(squCheck(board,i,0) && squCheck(board,i,3) && squCheck(board,i,6) ){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean squCheck(char[][] board,int x,int y){
        HashSet<Character> set = new HashSet<>();
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                  if(board[i][j] != '.'){
                  if(set.contains(board[i][j])) {
                      return  false;
                  }
                  set.add(board[i][j]);
                }
            
            }
        }
        
        return true;

    }
    public static boolean rowsandColumnCheck(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Character> c = new HashSet<>();
            HashSet<Character> r = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    
                }
                else if(c.contains(board[i][j])) {
                    return false;
                }
                else{
                    c.add(board[i][j]);
                }
                if(board[j][i]=='.'){
                    
                }
                else if(r.contains(board[j][i])) {
                    return false;
                }
                else{
                    r.add(board[j][i]);
                }
            }
        }
        return true;
    }
}