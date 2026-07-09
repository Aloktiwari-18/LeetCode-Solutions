class Solution {
    public int maximumSum(int[] arr) {
        int nodelete= arr[0];
        int onedelete=0;
        int purananodelete=0;
        int puranaonedelete=0;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            purananodelete = nodelete;
            puranaonedelete=onedelete;

            nodelete= Math.max(purananodelete+arr[i], arr[i]);

            onedelete= Math.max(puranaonedelete+arr[i], purananodelete);

            res= Math.max(nodelete,Math.max(res,onedelete));
            
        }
        return res;
        
    }
}