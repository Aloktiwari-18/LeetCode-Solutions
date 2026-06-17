class Solution {
    public void gameOfLife(int[][] board) {

        int n = board.length;
        int m = board[0].length;

        int[][] dirs = {
            {0,1}, {0,-1},
            {-1,0}, {1,0},
            {-1,-1}, {-1,1},
            {1,-1}, {1,1}
        };

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                int live = 0;

                for(int[] dir : dirs){

                    int r = i + dir[0];
                    int c = j + dir[1];

                    if(r<0 || c<0 || r>=n || c>=m)
                        continue;

                    if(board[r][c] == 1 || board[r][c] == -1)
                        live++;
                }

                if(board[i][j] == 1){
                    if(live < 2 || live > 3)
                        board[i][j] = -1;
                }
                else{
                    if(live == 3)
                        board[i][j] = 2;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(board[i][j] == -1)
                    board[i][j] = 0;

                else if(board[i][j] == 2)
                    board[i][j] = 1;
            }
        }
    }
}