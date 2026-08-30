class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st= new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.size()>0  && st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
            

        }
        StringBuilder sb= new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}