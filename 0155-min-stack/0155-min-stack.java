class MinStack {
    Stack<Integer> min;
    Stack<Integer> st;
    public MinStack() {
        min=new Stack<>();
        st= new Stack<>();

    }
    
    public void push(int val) {
        st.push(val);
        if(min.size()==0 || val<min.peek()){
            min.push(val);
        }else{
            min.push(min.peek());
        }
        
    }
    
    public void pop() {
        st.pop();
        min.pop();
        
    }
    
    public int top() {
       return st.peek();
        
    }
    
    public int getMin() {
       return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */