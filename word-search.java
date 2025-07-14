class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int chi){
        if(chi == word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.charAt(chi)!=board[i][j]){
            return false;
        }
        char temp = board[i][j];
        board[i][j]='#';  // marking visited

        boolean found = dfs(board, word, i, j-1, chi+1) || //left
                dfs(board, word, i, j+1, chi+1) || //right
                dfs(board, word, i-1, j, chi+1) || //top
                dfs(board, word, i+1, j, chi+1);   //bottom

        board[i][j]=temp; //restoring the character after backtracking
        return found;
    }
}