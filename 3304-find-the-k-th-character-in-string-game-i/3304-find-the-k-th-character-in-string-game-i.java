class Solution {
    public char kthCharacter(int k) {
        StringBuilder res= new StringBuilder();
        res.append("a");
        while(res.length()<k){
            StringBuilder sb= new StringBuilder();
            String temp= res.toString();
            for(char ch: temp.toCharArray()){
                char a= (char)(ch+1);
                sb.append(a);

            } 
            res.append(sb);
        }

        return res.charAt(k-1);



        

    }
}