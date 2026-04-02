class Solution {
    public static List<String> constructBoard(char [][] board){
        List<String> currentSol= new ArrayList<>();
        for(char row[]: board){
            currentSol.add(new String (row));

        }
        return currentSol;
    }
    public static boolean isSafe(char [][] board, int row, int col){
        for(int i=0;i<row; i++){
            if(board[i][col]=='Q') return  false;
        }
        for(int i= row-1, j=col-1 ;i>=0 && j>=0 ;i--, j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i= row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;

    }
    public static void backtrack(char [][] board, int row, List<List<String>> res){
        if(row==board.length){
            res.add(constructBoard(board));
            return;
        }
        for(int col=0;col<board.length;i++){
            if(isSafe(board, row, res)){
                board[row][col]='Q';
                backtrack(board, row, res);
                board[row][col]='.';
            }
        }
    }


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        char[][] board= new char[n][n];
        for(char [] row: board){
            Arrays.fill(row, '.');
        }
        backtrack(board, 0, result);
        return result;    
    }
}