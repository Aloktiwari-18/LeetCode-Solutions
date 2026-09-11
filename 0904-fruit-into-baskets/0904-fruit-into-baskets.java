class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        if(n<=2){
            return n;
        }
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer, Integer> map= new HashMap<>();
        while(right<n){
            int ele= fruits[right];
            map.put(ele, map.getOrDefault(ele, 0)+1);
            while(map.size()>2){
                int e= fruits[left];
                map.put(e, map.get(e)-1);
                left++;
                if(map.get(e)==0){
                    map.remove(e);
                }
            }
            if(map.size()<=2){
                max=Math.max(max, right-left+1);
            }
            right++;

        }
        return max;

        
    }
}