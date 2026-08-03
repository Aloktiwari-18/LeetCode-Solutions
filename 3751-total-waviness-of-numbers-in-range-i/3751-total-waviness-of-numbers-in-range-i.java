class Solution {
     int cnt=0;
    public int helper(int curr, int num2, int []dp){
        if(curr>num2){
            return 0;
        }

        if(dp[curr]!=Integer.MIN_VALUE){
            return dp[curr];
        }
        int cnt=0;
        String s= String.valueOf(curr);
        for(int i=1;i<s.length()-1;i++){
           if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1) 
                 || s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                     cnt++;
                 }
        }
        return dp[curr]=cnt+helper(curr+1, num2, dp);
    }
    public int totalWaviness(int num1, int num2) {
    //     int cnt=0;
    //    for(int x=num1; x<=num2;x++){
    //         String s= String.valueOf(x);
    //         for(int i=1;i<s.length()-1;i++){
    //             if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1) 
    //             || s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
    //                 cnt++;
    //             }

    //         }
    //    }
    //    return cnt;
   
    int dp[]= new int[num2+1];
    Arrays.fill(dp, Integer.MIN_VALUE);
    return  helper(num1, num2,dp);
     
        
    }
}