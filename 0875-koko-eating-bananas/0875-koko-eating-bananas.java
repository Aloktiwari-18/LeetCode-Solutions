class Solution {

    public static long eatMin(int[] arr, int banana) {
        long target = 0;
        for (int i = 0; i < arr.length; i++) {
            long hrs = (arr[i] + banana - 1L) / banana; 
            target += hrs;
        }
        return target;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int num : piles) {
            max = Math.max(max, num);
        }

        int left = 1;
        int right = max;
        int ans = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long time = eatMin(piles, mid);

            if (time <= h) {
                ans = mid;       
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }

        return ans;
    }
}
