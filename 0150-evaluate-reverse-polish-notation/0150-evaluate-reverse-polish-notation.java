class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(String c: tokens){
            if(c.equals("+")){
                int f=st.pop();
                int s=st.pop();

                st.push(f+s);
            }
            else if(c.equals("-")){
                int f=st.pop();
                int s=st.pop();

                st.push(s-f);
            }
            else if(c.equals("*")){
                int f=st.pop();
                int s=st.pop();

                st.push(f*s);
            }
            else if(c.equals("/")){
                int f=st.pop();
                int s=st.pop();

                st.push(s/f);
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
        
    }
}