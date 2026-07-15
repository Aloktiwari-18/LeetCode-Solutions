class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<String> set= new HashSet<>();
        int s= allowed.length();
        int all[]= new int[26];
        for(int i=0;i<s;i++){
            int num= allowed.charAt(i)-'a';
            all[num]++;

        }
        int count=0;
        
        for(String word:words){
            int n= word.length();
            int i=0;
            
            while(i<n){
                char ch= word.charAt(i);
                int ind= ch-'a';
                if(all[ind]==0){
                    break;
                }
                
                i++;

            }
            if(i==word.length()){
                count++;
            }



        }
        return count;
        
    }
}