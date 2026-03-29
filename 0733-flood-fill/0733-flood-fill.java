class Solution {
    public static void dfs(int [][] image, int sr, int sc, int color, int oldColor){
          int n= image.length;
          int m= image[0].length;
          if(sr<0 || sc<0 || sr>=n || sc>=m || image[sr][sc]!=oldColor){
            return ;
        }
        image[sr][sc]= color;
        dfs(image,sr+1,sc,color, oldColor);
        dfs(image,sr+1,sc,color, oldColor);


    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor= image[sr][sc];
        if(oldColor== color) return image;
        dfs(image, sr, sc, color, oldColor);
        return image;

        
    }
}