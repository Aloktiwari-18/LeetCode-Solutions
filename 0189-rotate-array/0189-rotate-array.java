class Solution {
    public void rotate(int[] nums, int k) {
        Stack<Integer> st1= new Stack<>();
                Stack<Integer> st2= new Stack<>();

        int n= nums.length;
        k=k%n;
        for(int i=n-1;i>=0;i--){
            if(i>=n-k) st1.push(nums[i]);
            else st2.push(nums[i]);

        }
        // nums[]= new int[n];
        int i=0;
        while(st1.size()!=0){
            nums[i++]= st1.pop();
            
        }
        while(st2.size()!=0){
            nums[i++]=st2.pop();
        }

        
    }
}