class StockSpanner {
    class Pair{
        int price1;
        int span1;

        Pair( int price1,int span1){
            
            this.price1= price1;
            this.span1=span1;
        }
    }
    Stack<Pair> st;

    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int span1=1;
        while(st.size()!=0 && st.peek().price1<=price){
            span1+=st.peek().span1;
            st.pop();
        }
        
            st.push( new Pair(price,span1));
        
        return span1;

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */