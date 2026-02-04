class Solution {
    public boolean isNStraightHand(int[] arr, int k) {
        int n = arr.length;
        if (n % k != 0 || k>n) return false;
        
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 0) continue;
            for (int i = 0; i <k; i++) {
                int curr = num + i;
                if (!map.containsKey(curr) || map.get(curr) == 0)
                    return false;
                map.put(curr, map.get(curr) - 1);
            }
        }
        return true;
    }
}