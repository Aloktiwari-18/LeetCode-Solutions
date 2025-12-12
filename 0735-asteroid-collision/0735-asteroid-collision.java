class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int cur = asteroids[i];

            // Right-moving — push and continue
            if (cur > 0) {
                st.push(cur);
                continue;
            }

            // cur < 0 => possible collisions only with positive asteroids on stack
            boolean destroyed = true;

            // Pop all smaller right-moving asteroids
            while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(cur)) {
                st.pop();
            }

            // If top is a right-moving asteroid now
            if (!st.isEmpty() && st.peek() > 0) {
                if (st.peek() == Math.abs(cur)) {
                    // equal → both destroy
                    st.pop();
                    destroyed = false;
                } else {
                    // top is bigger right-moving → current destroyed
                    destroyed = false;
                }
            }
            // else: stack empty or top is left-moving → current survives (alive stays true)

            if (destroyed) st.push(cur);
        }

        // Convert stack (bottom -> top) to array
        int n = st.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = st.get(i);
        return ans;
    }
}
