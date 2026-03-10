import java.util.*;

class Solution {
    public long countPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        long pair = 0;
        
        for(int ele : nums){
            
            int g = gcd(ele, k);
            
            for(int key : map.keySet()){
                
                if((long)g * key % k == 0){
                    pair += map.get(key);
                }
            }
            
            map.put(g, map.getOrDefault(g,0) + 1);
        }
        
        return pair;
    }
    
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}