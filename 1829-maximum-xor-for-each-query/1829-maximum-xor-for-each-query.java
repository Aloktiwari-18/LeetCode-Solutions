class Solution {

    public static void solve(int right, int xor, int nums[],
                             int maximized, ArrayList<Integer> arr) {

        if (right < 0) {
            return;
        }

        int k = xor ^ maximized;
        arr.add(k);

        xor ^= nums[right];

        solve(right - 1, xor, nums, maximized, arr);
    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int maximized = (1 << maximumBit) - 1;

        ArrayList<Integer> arr = new ArrayList<>();

        solve(nums.length - 1, xor, nums, maximized, arr);

        int[] ans = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}