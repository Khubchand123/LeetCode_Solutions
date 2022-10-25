class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int board[][] = new int[8][8];
        for(int[] i:queens){
            board[i[0]][i[1]]=1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        int i=king[0];
        int j=king[1];
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