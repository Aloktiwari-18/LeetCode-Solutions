class Solution {
    public int[] minOperations(String boxes) {
        int ans[]= new int[boxes.length()];
        HashSet<Integer> set= new HashSet<>(); 
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                set.add(i);
            }
        }
        for(int i=0;i<boxes.length();i++){
            int e=0;
           for(int ele:set){
            e+=Math.abs(ele-i);
            
           }
           ans[i]=e;

        }
        return ans;

        
    }
}