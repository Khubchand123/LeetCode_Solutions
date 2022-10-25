class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int board[][] = new int[8][8];
        for(int[] i:queens){
            board[i[0]][i[1]]=1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        int i=king[0];
        int j=king[1];
                 // checking 1st queen in left top diagonal
        while(i>=0 && j>=0){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            i--;
            j--;
        }
        i=king[0];
        j=king[1];
                 // checking 1st queen in right top diagonal
        while(i>=0 && j<8){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            i--;
            j++;
        }
        i=king[0];
        j=king[1];
                 // checking 1st queen in left down diagonal
        while(i<8 && j>=0){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            i++;
            j--;
        }
        i=king[0];
        j=king[1];
                 // checking 1st queen in right down diagonal
        while(i<8 && j<8){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            i++;
            j++;
        }
        i=king[0];
        j=king[1];
                 // checking 1st queen in left horizontally 
        while(i>=0){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            i--;
        }
        i=king[0];
                    // checking 1st queen in right horizontally 
        while(i<8){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            i++;
        }
        i=king[0];
            // checking 1st queen in top vertically 
        while(j>=0){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            j--;
        }
        j=king[1];
                // checking 1st queen in down vertically
        while(j<8){
            if(board[i][j]==1){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                ans.add(temp);
                break;
            }
            j++;
        }
        return ans;
    }
}