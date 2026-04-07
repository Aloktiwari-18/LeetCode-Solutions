class Solution {

    public boolean checkValidGrid(int[][] grid) {

        int n = grid.length;

        if(grid[0][0] != 0) return false;

        int x = 0, y = 0;

        for(int move = 1; move < n * n; move++){

            boolean found = false;

            // check all 8 moves
            int[] dx = {2,2,-2,-2,1,1,-1,-1};
            int[] dy = {1,-1,1,-1,2,-2,2,-2};

            for(int k = 0; k < 8; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx >= 0 && ny >= 0 && nx < n && ny < n 
                   && grid[nx][ny] == move){
                    
                    x = nx;
                    y = ny;
                    found = true;
                    break;
                }
            }

            if(!found) return false;
        }

        return true;
    }
}