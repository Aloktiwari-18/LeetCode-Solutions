class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int left = 0;
        int right=0;
        long sum = 0;
        long max = 0;
        HashSet<Integer> map=new HashSet<>();
        
        while (right < n) {

            while (map.contains(arr[right])) {
                sum -= arr[left];
                map.remove(arr[left]);
                left++;
            }

            map.add(arr[right]);
            sum += arr[right];

            if (right - left + 1 > k) {
                sum -= arr[left];
                map.remove(arr[left]);
                left++;
            }

            if (right - left + 1 == k) {
                max = Math.max(max, sum);
            }

            right++;
        }
        return   (long) max;


        
    }
}