
class Solution {
    
    public int[] arrayRankTransform(int[] arr) {
        int n= arr.length;
        int ans[]= new int[n];
        int temp[]= arr.clone();
        Arrays.sort(temp);
        
        HashMap<Integer, Integer> map= new HashMap<>();
        int rnk=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], rnk++);
               
            } 

        }
        for(int i=0;i<n;i++){
            ans[i]= map.get(arr[i]);
        }
        return ans;
        
       
        
       
        
        
    }
}