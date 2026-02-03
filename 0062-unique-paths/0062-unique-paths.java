class Solution {
    public static int path(int row, int col, int er, int ec,int [][]dp){
        if(row>=er || col>=ec){
            return 0;
        }

        if(row==er-1 && col==ec-1) return 1;
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int right=path(row, col+1,er,ec,dp);
        int left=path(row+1,col, er, ec,dp);

        return dp[row][col]=left+right;

    }
    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]= -1;
            }
        }
        return path(0,0,m,n,dp);

        
    }
}