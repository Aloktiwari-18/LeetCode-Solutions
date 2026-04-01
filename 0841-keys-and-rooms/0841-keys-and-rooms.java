class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        Stack<Integer> st= new Stack<>();
        st.push(0);
        
        boolean vis[]= new boolean [n];
        vis[0]= true;
        while(!st.isEmpty()){
            int room= st.pop();
            
            for(int neighbor: rooms.get(room)){
                if(vis[neighbor]==false){
                st.push(neighbor);
                vis[neighbor]=true;

                }

                
            }
        }
        for(boolean v : vis){
            if(!v) return false;
        }
return true;
        
        
    }
}