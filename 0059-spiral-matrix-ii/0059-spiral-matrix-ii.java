class Solution {
    public int[][] generateMatrix(int n) {
        
        
        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=n-1;
        int count=1;
        int arr[][]=new int [n][n];
        while(count<=n*n){
            for(int i=minCol;i<=maxCol;i++){
                arr[minRow][i]=count;
                count++;
            }
            for(int i=minRow+1;i<=maxRow;i++){
                arr[i][maxCol]=count;
                count++;
            }
            for(int i=maxCol-1;i>=minCol;i--){
                arr[maxRow][i]=count;
                count++;
            }
            for(int i=maxRow-1;i>=minRow+1;i--){
                arr[i][minCol]=count;
                count++;

            }
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }
        return arr;
    }
}