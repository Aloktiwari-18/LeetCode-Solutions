class MyQueue {
    Stack<Integer> main;
    Stack<Integer> helper;

    public MyQueue() {
        main=new Stack<>();
        helper=new Stack<>();
        
    }
    
    public void push(int x) {
        main.push(x);

        
    }
    
    public int pop() {
        while(main.size()>1){
            helper.push(main.pop());
        }
        int del=main.pop();
        while(helper.size()>0){
            main.push(helper.pop());
        }
        return del;

        
    }
    
    public int peek() {
        while(main.size()>1){
            helper.push(main.pop());

        }
        int front= main.peek();
        while(helper.size()>0){
            main.push(helper.pop());
        }
        return front;
        
        
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */