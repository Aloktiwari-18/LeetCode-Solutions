class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount=Integer.MIN_VALUE;
        int index=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            int countRow=0;
            for(int j=0;j<mat[0].length;j++){
                countRow+=mat[i][j];

            }
            if(countRow>maxCount){
                maxCount=countRow;
                index=i;

            }
        }
        return new int[]{index,maxCount};
        
    }
}