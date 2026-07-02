class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int t= Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<t){
                return true;
            }
            while(st.size()!=0 && st.peek()<nums[i]){
               t= st.pop();
                
            }
            st.push(nums[i]);
        }
        return false;
        
    }
}