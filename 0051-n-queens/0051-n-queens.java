class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> obj= new ArrayList<>();
        N_Queen(obj,new boolean[n][n],n,0);
        return obj;
    }
    public static void N_Queen(List<List<String>> obj,boolean[][] board, int tq, int row) {
		if (tq == 0) {
			List<String> temp = insert(board);
            obj.add(new ArrayList<>(temp));
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				N_Queen(obj,board, tq - 1, row + 1);
				board[row][col] = false;
			}

		}

	}


	public static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub

		int r = row;
		// vertical
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		// left Diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		// right Diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}
		return true;
	}
    static List<String> insert(boolean[][] board){
      
    List<String> ans = new ArrayList<>();
    for(boolean[] row: board){
        String S = "";
        for(boolean element:row){
            if(element){
                S += "Q";
            }
            else
                S += ".";
        }
        ans.add(S);
    }
      return ans;
}
}