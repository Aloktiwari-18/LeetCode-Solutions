class Solution {
    public boolean isValid(String s) {
        int n= s.length();
        Stack<Character> st= new Stack<>();

        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(st.size()==0 && (ch=='}' || ch==']' || ch==')')){
                return false;
            }
            else if(st.size()==0){
                st.push(ch);
            }
            else if(st.size()!=0 && ((st.peek()=='(' && ch==')') || (st.peek()=='{' && ch=='}') || (st.peek()=='[' && ch==']'))) {
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.size()==0;
        
    }
}