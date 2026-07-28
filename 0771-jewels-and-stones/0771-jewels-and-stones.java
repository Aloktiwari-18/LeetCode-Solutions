class Solution {
    public int numJewelsInStones(String j, String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(j.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        return count;
        
    }
}