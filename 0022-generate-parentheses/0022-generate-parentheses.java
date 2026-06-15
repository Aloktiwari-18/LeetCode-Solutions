class Solution {
    public static void f(int n, StringBuilder temp, int open ,int close, List<String> ans){
        if(close>n || close>open || open > n) return ;
        if(temp.length()==2*n){
            ans.add(temp.toString());
        }
        
            temp.append("(");
            f(n, temp, open+1, close, ans );
            temp.deleteCharAt(temp.length()-1);
            temp.append(")");
            f(n, temp, open, close+1, ans );
            temp.deleteCharAt(temp.length()-1);
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        f(n, sb, 0, 0, ans);
        return ans;
        
    }
}