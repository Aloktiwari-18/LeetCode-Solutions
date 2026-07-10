import java.util.*;

class Solution {

    class Pair {
        int start;
        int end;
        int type; // 0 -> first list, 1 -> second list

        Pair(int start, int end, int type) {
            this.start = start;
            this.end = end;
            this.type = type;
        }
    }

    public int[][] intervalIntersection(int[][] first, int[][] second) {

        ArrayList<Pair> list = new ArrayList<>();

        for (int[] x : first)
            list.add(new Pair(x[0], x[1], 0));

        for (int[] x : second)
            list.add(new Pair(x[0], x[1], 1));

        Collections.sort(list, (a, b) -> {
            if (a.start == b.start)
                return Integer.compare(a.end, b.end);
            return Integer.compare(a.start, b.start);
        });

        ArrayList<int[]> res = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            Pair curr = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {

                Pair next = list.get(j);

                // no more overlap possible
                if (next.start > curr.end)
                    break;

                // compare only first-second intervals
                if (curr.type != next.type) {

                    int start = Math.max(curr.start, next.start);
                    int end = Math.min(curr.end, next.end);

                    if (start <= end) {
                        res.add(new int[] { start, end });
                    }
                }
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}