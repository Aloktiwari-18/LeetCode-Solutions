class Solution {
    public String interpret(String com) {
        Stack<Character> st= new Stack<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<com.length();i++){
            char ch=com.charAt(i);
            if(ch=='G'){
                sb.append(ch);

            }
            else if(st.size()>0 && st.peek()=='(' && ch==')'){
                sb.append('o');
                st.pop();
                
            }
            else if(st.size()==0 && ch=='('){
                st.push(ch);
            }
            else if(st.size()>0 && st.peek()=='(' && ch=='a'){
                sb.append(ch);
                st.pop();
            }else if(st.size()==0 && ch==')'){
                continue;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}