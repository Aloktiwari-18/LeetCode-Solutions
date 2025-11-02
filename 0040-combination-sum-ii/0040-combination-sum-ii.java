import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // ✅ sorting to handle duplicates
        findCombination(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombination(int[] arr, int target, int idx, List<Integer> ds, List<List<Integer>> ans) {
        // ✅ Base case
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            // skip duplicates
            if (i > idx && arr[i] == arr[i - 1]) continue;

            // stop if element is greater than remaining target
            if (arr[i] > target) break;

            // pick current element
            ds.add(arr[i]);
            findCombination(arr, target - arr[i], i + 1, ds, ans); // move to next index (no reuse)
            ds.remove(ds.size() - 1); // backtrack
        }
    }
}
