class Solution {
    public static void dfs(int i,int j,int[][] image,int oldColor,int newColor){
        int n= image.length;
        int m= image[0].length;
        if(i<0 || j<0 || i>=n || j>=m || image[i][j]!=oldColor){
            return ;
        }
        image[i][j]=newColor;
        dfs(i - 1, j, image,oldColor,newColor); // up
        dfs(i + 1, j, image,oldColor,newColor); // down
        dfs(i, j - 1, image,oldColor,newColor); // left
        dfs(i, j + 1, image,oldColor,newColor);


    }
   
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor= image[sr][sc];
        if(oldColor==color) return image;
        dfs(sr,sc,image,oldColor,color);
        return image;
        
    }
}