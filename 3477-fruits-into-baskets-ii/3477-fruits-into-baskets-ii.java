class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;    
        HashSet<Integer > map= new HashSet<>();
        int unplace=0;
        for(int i=0;i<n;i++){
            boolean place=false;
            for(int j=0;j<n;j++){
                 if(fruits[i]<=baskets[j] && !map.contains(j)){
                    map.add(j);
                    place=true;
                    break;
                 }
            }
            if(!place){
                unplace++;
            }
        }
        return unplace;
    }
}