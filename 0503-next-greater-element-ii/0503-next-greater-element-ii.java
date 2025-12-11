import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>(); // store indices

        // iterate 2*n times to simulate circular array
        for (int i = 0; i < 2 * n; i++) {
            int cur = nums[i % n];

            // while current value is greater than value at index on stack
            while (!st.isEmpty() && nums[st.peek()] < cur) {
                ans[st.pop()] = cur;
            }

            // push index only during first pass
            if (i < n) st.push(i);
        }

        return ans;
    }
}
