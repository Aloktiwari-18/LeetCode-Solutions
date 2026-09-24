class Solution {
    public String LCS(String s1, String s2){
        int m= s1.length();
        int n= s2.length();
        int dp[][]= new int [s1.length()+1][s2.length()+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int i=m;
        int j=n;
        StringBuilder str=new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                str.append(s1.charAt(i-1));
                i--;
                j--;
            }
           else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else{
                j--;
            }

        }
        str.reverse();
        return str.toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs= LCS(str1, str2);
        StringBuilder ans= new StringBuilder();
        int i=0;
        int j=0;
        int k=0;
        System.out.println(lcs);

        while(i<str1.length() && j<str2.length() && k<lcs.length()){
            while(str1.charAt(i)!=lcs.charAt(k)){
                ans.append(str1.charAt(i));
                i++;
            }
            while(str2.charAt(j)!=lcs.charAt(k)){
                ans.append(str2.charAt(j));
                j++;
            }
            ans.append(lcs.charAt(k));
            i++; j++;k++;

        }
        
            while(i<str1.length()){
                    ans.append(str1.charAt(i));
                    i++;
                }
            
       
            while(j<str2.length()){
                    ans.append(str2.charAt(j));
                    j++;
                }
            

        
        return ans.toString();
        
    }
}