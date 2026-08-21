class Solution {

    public void solve(int[] nums, boolean[] used,
                      List<Integer> sub, List<List<Integer>> ans) {

        if (sub.size() == nums.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Same value ko same level par dobara choose mat karo
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            if (!used[i]) {

                used[i] = true;
                sub.add(nums[i]);

                solve(nums, used, sub, ans);

                sub.remove(sub.size() - 1);
                used[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        solve(nums, used, sub, ans);

        return ans;
    }
}