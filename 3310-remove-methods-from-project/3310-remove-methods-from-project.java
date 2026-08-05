class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] inv : invocations) {
            adj.get(inv[0]).add(inv[1]);
        }

        boolean[] isSuspicious = new boolean[n];
        dfs(k, adj, isSuspicious);

        boolean canRemove = true;
        for (int[] inv : invocations) {
            int u = inv[0], v = inv[1];
            if (!isSuspicious[u] && isSuspicious[v]) {
                canRemove = false;
                break;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!canRemove || !isSuspicious[i]) {
                result.add(i);
            }
        }

        return result;
    }

    private void dfs(int u, List<List<Integer>> adj, boolean[] isSuspicious) {
        isSuspicious[u] = true;
        for (int v : adj.get(u)) {
            if (!isSuspicious[v]) {
                dfs(v, adj, isSuspicious);
            }
        }
    }
}