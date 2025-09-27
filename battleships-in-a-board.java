class Solution {
    public int countBattleships(char[][] board) {
        int count =0, rows=board.length, cols=board[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]=='X'){
                    dfs(board, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] board, int i, int j){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!='X'){
            return;
        }

        board[i][j]='*';
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
}