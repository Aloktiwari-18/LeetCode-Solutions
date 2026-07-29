class Solution {
    public int numberOfBeams(String[] bank) {
        int count=0;
        int prev=0;
        for(String row: bank){
            int curr=0;
            for(char ch: row.toCharArray()){
                if(ch=='1'){
                    curr++;
                }
            }
            if(curr>0){
                count+=curr*prev;
                prev=curr;
            }
        }
        return count;
    }
}