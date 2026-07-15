class Solution {
    
    
    public static void solve(int n, int curr, ArrayList<String> ans,  StringBuilder sb){
        if(curr==n){
            ans.add(sb.toString());
            return ;
        }
        if(sb.length()==0 || sb.charAt(sb.length()-1)=='1'){
            sb.append("0");
             solve(n, curr+1, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("1");
       solve(n, curr+1, ans, sb);
       sb.deleteCharAt(sb.length()-1);
    }
    public List<String> validStrings(int n) {
        ArrayList<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
         solve(n,0,ans,sb);
        return ans;
        
    }
}