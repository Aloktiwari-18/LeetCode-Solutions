class Solution {
    public int finalValueAfterOperations(String[] oper) {
        int ans=0;
         
        for(String x: oper){
            ans+=(x.charAt(1)=='+' ?1:-1);
        }
        return ans;
        
    }
}