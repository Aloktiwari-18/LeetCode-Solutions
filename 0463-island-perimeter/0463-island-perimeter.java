class Solution {
    public int islandPerimeter(int[][] matrix) {

        int n= matrix.length;
        int m= matrix[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    if(i-1<0 || matrix[i-1][j]==0) ans++;
                    if(i+1>=n || matrix[i+1][j]==0) ans++;
                    if(j-1<0 || matrix[i][j-1]==0) ans++;
                    if(j+1>=m || matrix[i][j+1]==0) ans++;
                }
            }
        }
        return ans;
        
        
    }
}