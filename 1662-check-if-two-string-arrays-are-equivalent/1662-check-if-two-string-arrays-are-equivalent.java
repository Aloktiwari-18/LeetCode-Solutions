class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        return String.join("", w1).equals(String.join("", w2));
        
    }
}