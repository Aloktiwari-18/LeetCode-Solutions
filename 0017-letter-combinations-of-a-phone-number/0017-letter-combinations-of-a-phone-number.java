class Solution {
    public void solve(String digits, int idx , StringBuilder sb, List<String >ans, Map<Character, String> map){
        if(idx==digits.length()){
            
                ans.add(sb.toString());
            
            return ;
        }
        String letter=map.get(digits.charAt(idx));

       for(char ch: letter.toCharArray()){
        sb.append(ch);
        solve(digits, idx+1, sb, ans, map);
        sb.deleteCharAt(sb.length()-1);
       }

    }
    public List<String> letterCombinations(String digits) {
        
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        solve(digits, 0, sb,ans, map);
        
        return ans;
        
    }
}