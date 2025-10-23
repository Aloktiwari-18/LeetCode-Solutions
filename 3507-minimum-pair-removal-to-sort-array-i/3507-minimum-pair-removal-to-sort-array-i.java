import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int x : nums) arr.add(x);

        int operations = 0;

        while (!isSorted(arr)) {
            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            // Find leftmost pair with minimum sum
            for (int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            // Merge that pair
            int merged = arr.get(idx) + arr.get(idx + 1);
            arr.set(idx, merged);
            arr.remove(idx + 1);
            operations++;
        }

        return operations;
    }

    private boolean isSorted(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) return false;
        }
        return true;
    }
}
