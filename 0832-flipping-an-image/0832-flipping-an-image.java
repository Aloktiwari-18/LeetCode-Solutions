class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n= image.length;
        int[][] flip= new int[n][n];
        int [][] invert= new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==1){
                    flip[i][j]=0;
                }else{
                    flip[i][j]=1;
                }

            }

        }
        
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=n-1;j>=0;j--){
                invert[i][k]= flip[i][j];
                k++;

            }
        }
        return invert;



        
    }
}