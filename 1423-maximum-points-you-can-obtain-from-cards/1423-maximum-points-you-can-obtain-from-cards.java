class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        if(n==k){
            return sum;
        }
        int end= cardPoints.length-1;
        maxSum=Math.max(sum, maxSum);
        for(int i=k;i>=0;i--){
            sum=sum+cardPoints[end]-cardPoints[i];
            maxSum=Math.max(maxSum, sum);
            end--;
        }
        return maxSum;       
    }
}