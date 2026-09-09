class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long threshold = 999;
        while (n >= threshold) {
            ans += (n - threshold);
            if (threshold > (Long.MAX_VALUE - 999) / 1000) {
                break;
            }
            threshold = threshold * 1000 + 999;
        }
        return ans;
    }
}
