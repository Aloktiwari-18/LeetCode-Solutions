class Solution {
    public int largestCombination(int[] candidates) {
        int[] bitCount =  new int[24];
        for (int candidate : candidates) {
            markBitcount(candidate, bitCount);
        }
        int max = 0;
        for (int count : bitCount) {
            max = Math.max(max, count);
        }
        return max;
    }

    private void markBitcount(int num, int[] bitCount) {
        for (int i = 23; i >=0 && num > 0; i--) {
            bitCount[i] += (int)(num & 1);
            num = num >> 1;
        }
    }
}