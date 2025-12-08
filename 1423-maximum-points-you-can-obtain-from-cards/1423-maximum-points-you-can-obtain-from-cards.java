class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            leftSum=leftSum+cardPoints[i];
            maxSum=leftSum;
        }
        int rightSum=0;
        int rIndex=cardPoints.length;
        for(int i= k-1;i>=0;i--){
            leftSum=leftSum-cardPoints[i];
            rightSum=rightSum+cardPoints[rIndex-1];
            rIndex--;
            maxSum=Math.max(maxSum,leftSum+rightSum);
        }
    
    return maxSum;

        
    }
}