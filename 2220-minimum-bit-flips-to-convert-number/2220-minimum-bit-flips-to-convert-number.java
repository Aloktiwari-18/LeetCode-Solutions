class Solution {
    public int minBitFlips(int start, int goal) {
        int num=start^goal;
        return Integer.bitCount(num);
        
    }
}