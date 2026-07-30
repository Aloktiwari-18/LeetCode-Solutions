class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        for(int i=0;i<w1.length;i++){
            String s= w1[i];
            for(int j=0;j<s.length();j++){
                sb1.append(s.charAt(j));
            }
        }
        for(int i=0;i<w2.length;i++){
            String s= w2[i];
            for(int j=0;j<s.length();j++){
                sb2.append(s.charAt(j));
            }
        }
        
        return sb1.toString().equals(sb2.toString());
        
    }
}