class Solution {
    int count = 0;
    int target;

    public int numSubseq(int[] nums, int target) {
        this.target = target;
        dfs(nums, 0, new ArrayList<>());
        return count;
    }

    void dfs(int[] nums, int index, List<Integer> curr) {
        if (index == nums.length) {
            if (!curr.isEmpty()) {
                int min = Collections.min(curr);
                int max = Collections.max(curr);
                if (min + max <= target) count++;
            }
            return;
        }

        // Exclude current element
        dfs(nums, index + 1, curr);

        // Include current element
        curr.add(nums[index]);
        dfs(nums, index + 1, curr);

        // Backtrack
        curr.remove(curr.size() - 1);
    }
}
