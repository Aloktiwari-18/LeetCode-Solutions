class Solution {
    public static int uniquePath(int [][] nums, int row,int col,int er, int ec,int [][]dp){
        if(row>=er || col>=ec || nums[row][col]==1 ){
            return 0;
        }
        if(row==er-1 && col==ec-1){
            return 1;
        }
        if(dp[row][col]!=-1) return dp[row][col];
        int down= uniquePath(nums, row+1,col,er,ec,dp );
        int right=uniquePath(nums, row,col+1, er, ec,dp);

        return dp[row][col]= down+right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int [][] dp= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return uniquePath(obstacleGrid,0,0,m,n,dp);
        
    }
}