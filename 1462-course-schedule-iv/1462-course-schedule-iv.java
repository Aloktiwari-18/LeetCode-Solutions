class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] reachable = new boolean[numCourses][numCourses];

        for (int[] p : prerequisites) {
            reachable[p[0]][p[1]] = true;
        }

        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    if (reachable[i][k] && reachable[k][j]) {
                        reachable[i][j] = true;
                    }
                }
            }
        }

List<Boolean> ans= new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            ans.add(reachable[queries[i][0]][queries[i][1]]);
        }

        return ans;
        
    }
}