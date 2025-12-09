class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int left=0;
        int right=0;
        int n=fruits.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            int len=0;
            int lf=fruits[right];
            map.put(lf,map.getOrDefault(lf,0)+1);

            
            
            if(map.size()>2){
                int f=fruits[left];
                map.put(f,map.get(f)-1);
                if(map.get(f)==0){
                    map.remove(f);
                    
                }
                left++;
            }
            if(map.size()<=2){
                len=right-left+1;
                maxlen=Math.max(maxlen,len);

            }
            right++;
        }
        return maxlen;
        
    }
}