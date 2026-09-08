class Solution {
    public int countCommas(int n) {
        long totalCommas = 0;
        long currentPowerOfThousand = 1000;
        int commasPerNumber = 1;

        while (currentPowerOfThousand <= n) {
            long rangeStart = currentPowerOfThousand;
            long rangeEnd = currentPowerOfThousand * 1000 - 1;

            if (rangeEnd > n) {
                rangeEnd = n;
                totalCommas += (rangeEnd - rangeStart + 1) * commasPerNumber;
                break;
            } else {
                totalCommas += (rangeEnd - rangeStart + 1) * commasPerNumber;
            }
            
            currentPowerOfThousand *= 1000;
            commasPerNumber++;
        }

        return (int) totalCommas;
    }
}
