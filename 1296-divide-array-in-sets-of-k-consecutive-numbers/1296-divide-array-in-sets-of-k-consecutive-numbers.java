class Solution {
    public boolean isPossibleDivide(int[] arr, int k) {
        if (arr.length % k != 0) return false;

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        for (int x : arr) {
            if (map.get(x) == 0) continue;

            for (int i = 0; i < k; i++) {
                int curr = x + i;

                if (map.getOrDefault(curr, 0) == 0)
                    return false;

                map.put(curr, map.get(curr) - 1);
            }
        }
        return true;
    }
}
