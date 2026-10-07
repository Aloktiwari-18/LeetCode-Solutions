class Solution {
    public List<String> removeInvalidParentheses(String s) {
        HashSet<String> set = new HashSet<>();

        helper(s, 0, 0, new StringBuilder(), set);

        int maxLen = 0;
        for(String str : set) {
            maxLen = Math.max(maxLen, str.length());
        }

        List<String> res = new ArrayList<>();
        for(String str : set) {
            if(str.length() == maxLen) res.add(str);
        }

        return res;
    }

    private void helper(String s, int idx, int bal, StringBuilder str, Set<String> set) {
        if(idx >= s.length()) {
            if(bal == 0) set.add(str.toString());
            return;
        }

        if(s.charAt(idx) == '(') {
            str.append('(');
            helper(s, idx + 1, bal + 1, str, set);
            str.deleteCharAt(str.length() - 1);
            helper(s, idx + 1, bal, str, set);
        } 
        else if(s.charAt(idx) == ')') {
            if(bal == 0) helper(s, idx + 1, bal, str, set);
            else {
                str.append(')');
                helper(s, idx + 1, bal - 1, str, set);
                str.deleteCharAt(str.length() - 1);
                helper(s, idx + 1, bal, str, set);
            }
        } 
        else {
            str.append(s.charAt(idx));
            helper(s, idx + 1, bal, str, set);
            str.setLength(str.length() - 1);
        }
    }
}