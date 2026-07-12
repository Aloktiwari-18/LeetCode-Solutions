class Pair{
    char word;
    int count;

    Pair(char word, int count){
        this.word= word;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        int n= s.length();
        Stack<Pair> st= new Stack<>();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(st.size()==0){
                st.push(new Pair(ch, 1));

            }
           else  if(st.peek().word!=ch){
                st.push(new Pair(ch, 1));

            }
           else  if(st.peek().count <k-1){
                Pair comb= st.pop();

                int num= comb.count+1;
                st.push(new Pair(comb.word, num));
            }
            else {
                st.pop();
            }
        }
        StringBuilder sb= new StringBuilder();

        while(st.size()!=0){
            Pair res= st.pop();
            while(res.count-- >0){
                sb.append(res.word);
            }
        }
        sb.reverse();
        return sb.toString();
    }
}