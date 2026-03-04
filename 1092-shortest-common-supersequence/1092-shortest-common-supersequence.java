class Solution {

    public int lcs(int i, int j, StringBuilder s1, StringBuilder s2, int dp[][]){
        if(i < 0 || j < 0) return 0;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = 1 + lcs(i-1, j-1, s1, s2, dp);

        return dp[i][j] = Math.max(
                lcs(i-1, j, s1, s2, dp),
                lcs(i, j-1, s1, s2, dp)
        );
    }

    public String shortestCommonSupersequence(String str1, String str2) {

        StringBuilder s1 = new StringBuilder(str1);
        StringBuilder s2 = new StringBuilder(str2);

        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        
        lcs(m-1, n-1, s1, s2, dp);

        int i = m-1;
        int j = n-1;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 && j >= 0){

            if(s1.charAt(i) == s2.charAt(j)){
                sb.append(s1.charAt(i));
                i--;
                j--;
            }
            else if(i > 0 && dp[i-1][j] >= (j > 0 ? dp[i][j-1] : 0)){
                sb.append(s1.charAt(i));
                i--;
            }
            else{
                sb.append(s2.charAt(j));
                j--;
            }
        }

        while(i >= 0){
            sb.append(s1.charAt(i));
            i--;
        }

        while(j >= 0){
            sb.append(s2.charAt(j));
            j--;
        }

        return sb.reverse().toString();
    }
}