class Solution {
    public int maxProduct(int n) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        while(n>0){
            int rem= n%10;
            arr.add(rem);
            n=n/10;
        }

        int ans[]= new int[arr.size()];

        for(int i=0;i<arr.size();i++){
           ans[i]=arr.get(i);
        }
        int len=ans.length;
        Arrays.sort(ans);
        for(int i=0;i<len;i++){
          System.out.print(ans[i]+" ");
        }
        return ans[len-1]*ans[len-2];
        
    }
}