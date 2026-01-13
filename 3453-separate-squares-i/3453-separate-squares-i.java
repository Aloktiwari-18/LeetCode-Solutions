class Solution {

    public double separateSquares(int[][] squares) {
        double low = 0, high = 0;

        // find max possible y
        for (int[] s : squares) {
            high = Math.max(high, s[1] + s[2]);
        }

        // binary search
        for (int i = 0; i < 100; i++) { // enough for 1e-5 precision
            double mid = (low + high) / 2.0;

            double above = areaAbove(mid, squares);
            double below = totalArea(squares) - above;

            if (above > below) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private double areaAbove(double mid, int[][] squares) {
        double area = 0;

        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];

            if (mid <= y) {
                area += l * l;
            } else if (mid < y + l) {
                area += (y + l - mid) * l;
            }
        }
        return area;
    }

    private double totalArea(int[][] squares) {
        double area = 0;
        for (int[] s : squares) {
            area += (double) s[2] * s[2];
        }
        return area;
    }
}
