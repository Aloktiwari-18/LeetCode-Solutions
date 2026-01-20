class Solution {
    public int matrixScore(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] ^= 1;
                }
            }
        }

        for (int col = 1; col < m; col++) {
            int zeros = 0;
            for (int row = 0; row < n; row++) {
                if (arr[row][col] == 0) {
                    zeros++;
                }
            }
            if (zeros > n / 2) {
                for (int row = 0; row < n; row++) {
                    arr[row][col] ^= 1;
                }
            }
        }

        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int val = 0;
            for (int j = 0; j < m; j++) {
                val = val * 2 + arr[i][j];
            }
            sum += val;
        }

        return sum;
    }
}
