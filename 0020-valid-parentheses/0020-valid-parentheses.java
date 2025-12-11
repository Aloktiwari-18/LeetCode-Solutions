class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        return check(s, 0, new StringBuilder());
    }

    private boolean check(String s, int i, StringBuilder stack) {
        if (i == s.length()) return stack.length() == 0;

        char c = s.charAt(i);

        if (c == '(' || c == '{' || c == '[') {
            stack.append(c);
            return check(s, i + 1, stack);
        } else {
            if (stack.length() == 0) return false;
            char top = stack.charAt(stack.length() - 1);
            if ((c == ')' && top == '(') ||
                (c == '}' && top == '{') ||
                (c == ']' && top == '[')) {
                stack.deleteCharAt(stack.length() - 1);
                return check(s, i + 1, stack);
            } else {
                return false;
            }
        }
    }
}
