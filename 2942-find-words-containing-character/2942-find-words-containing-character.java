class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s= words[i];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch==x){
                    if(ans.contains(i)){
                        continue;
                    }
                    ans.add(i);
                    

                }
            }
        }
        return ans;
        
    }
}