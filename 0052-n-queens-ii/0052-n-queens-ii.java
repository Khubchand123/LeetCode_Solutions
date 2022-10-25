class Solution {
    public int totalNQueens(int n) {
        return N_Queen(new boolean[n][n],n,0);
        // return x;
    }
    public static int N_Queen(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			// x++;
			return 1;
		}
        int count=0;
		for (int col = 0; col < board.length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				count+=N_Queen(board, tq - 1, row + 1);
				board[row][col] = false;
			}

		}
        return count;

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
		// left Diagonal
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
}