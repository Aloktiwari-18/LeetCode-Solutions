class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        int n= nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int r=0;
            if(sum<0){
                r= (sum % k + k) % k;
            }else{
                r= sum%k;
            }
            
            if(map.containsKey(r)){
                count+=map.get(r);
            }
            map.put(r, map.getOrDefault(r,0)+1);
        }
        return count;
        
        
    }
}