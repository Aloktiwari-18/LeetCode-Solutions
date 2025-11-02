import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombinations(int[] arr, int target, int idx, List<Integer> ds, List<List<Integer>> ans) {
        // Base case
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Include current element (if possible)
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombinations(arr, target - arr[idx], idx, ds, ans); // reuse allowed
            ds.remove(ds.size() - 1); // backtrack
        }

        // Exclude current element
        findCombinations(arr, target, idx + 1, ds, ans);
    }
}
