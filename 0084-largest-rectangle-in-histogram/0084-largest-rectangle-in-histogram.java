class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int [] nse= new int[n]; 
        Stack<Integer> st= new Stack<>();
        nse[n-1]=n ;
        // Hamko length ko target karna hai isiliye hai next index ko le rahe hai
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]) st.pop();
            if(st.size()==0) nse[i]=n;

            else nse[i]=st.peek();
            st.push(i);
        }
        while(st.size()>0) st.pop();
        int [] pse= new int[n];
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]= st.peek();

            st.push(i);
        }
       int maxArea= 0;
       for(int i=0;i<n;i++){
        int num= heights[i];
       maxArea= Math.max(maxArea, num*(nse[i]-pse[i]-1));
       }
       return maxArea;
    }
}