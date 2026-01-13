class Solution {
     
    int [] drow={-1,0,1,0};
    int [] dcol={0,1,0,-1};
    public boolean  dfs(int x, int y, int px, int py, char [][] grid, boolean vis[][]){
        int n= grid.length;
     int m= grid[0].length;
        vis[x][y]=true;
        for(int i=0;i<4;i++){
            int nrow= x+drow[i];
            int ncol= y+dcol[i];
            if(nrow<0 || nrow>=n || ncol<0 || ncol>=m) continue;
            if( grid[nrow][ncol]!=grid[x][y]) continue;
            if(!vis[nrow][ncol]){
                if(dfs(nrow, ncol, x, y,grid, vis))
                return true;
            }
            else if(nrow!=px  || ncol!=py){
                return true;
            }
        }
        return false;

        
        
    }

    public boolean containsCycle(char[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        boolean vis[][]= new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j]){
                   if (dfs(i,j,-1, -1,grid, vis)) return true;
                }
            }
        }
        return false;
        
    }
}