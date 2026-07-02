class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int z=0;
        int o=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;

            }
            else{
                o++;
            }
            int diff=z-o;
            if(diff==0){
                res=Math.max(res,i+1);
            }
            if(!map.containsKey(diff)){
                map.put(diff, i);
            }
            if(map.containsKey(diff)){
                res= Math.max(res, i-map.get(diff));
            }
            
        }
         return res;
        
    }
}