class Solution {
    public boolean isValid(int[][] grid,int r,int c,int n,int currVal){
        if(r<0 || c<0 || r>=n || c>=n || grid[r][c] != currVal )return false;
        if(currVal == n*n-1)return true;
    
    boolean move1=isValid(grid,r-1,c-2,n,currVal+1);
    boolean move2=isValid(grid,r-2,c-1,n,currVal+1);
    boolean move3=isValid(grid,r-1,c+2,n,currVal+1);
    boolean move4=isValid(grid,r-2,c+1,n,currVal+1);
    boolean move5=isValid(grid,r+1,c+2,n,currVal+1);
    boolean move6=isValid(grid,r+2,c+1,n,currVal+1);
    boolean move7=isValid(grid,r+2,c-1,n,currVal+1);
    boolean move8=isValid(grid,r+1,c-2,n,currVal+1);
    return move1 || move2 || move3 || move4 ||move5||move6|| move7||move8;
    }
    public boolean checkValidGrid(int[][] grid) {
       return isValid(grid,0,0,grid.length,0); 
    }
}