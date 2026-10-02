class Solution {
    public void solve(int n, StringBuilder sb, List<String> ans, int o, int c){
        if(o>n || c>n|| c>o){
            return ;
        }
        if(sb.length()==2*n){
            ans.add(sb.toString());
        }
        sb.append("(");
        solve(n, sb, ans, o+1, c);
        sb.deleteCharAt(sb.length()-1);
        sb.append(")");
        solve(n, sb,  ans, o, c+1);
        sb.deleteCharAt(sb.length()-1);
        
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb= new StringBuilder();
        List<String> ans= new ArrayList<>();
        solve(n, sb, ans, 0, 0);
        return ans;
        
    }
}