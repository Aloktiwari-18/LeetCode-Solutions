import java.util.*;

class Solution {

    static class Event {
        double y, x1, x2;
        int type;
        Event(double y, double x1, double x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
    }

    public double separateSquares(int[][] squares) {
        List<Event> events = new ArrayList<>();

        for (int[] s : squares) {
            double x1 = s[0], x2 = s[0] + s[2];
            double y1 = s[1], y2 = s[1] + s[2];
            events.add(new Event(y1, x1, x2, 1));
            events.add(new Event(y2, x1, x2, -1));
        }

        events.sort(Comparator.comparingDouble(e -> e.y));

        List<double[]> active = new ArrayList<>();
        double totalArea = 0.0;

        // First pass → total union area
        for (int i = 0; i + 1 < events.size(); i++) {
            Event e = events.get(i);
            update(active, e);
            double height = events.get(i + 1).y - e.y;
            if (height > 0) {
                totalArea += height * unionX(active);
            }
        }

        double half = totalArea / 2.0;
        double currArea = 0.0;

        active.clear();

        // Second pass → find split y
        for (int i = 0; i + 1 < events.size(); i++) {
            Event e = events.get(i);
            update(active, e);

            double y1 = e.y;
            double y2 = events.get(i + 1).y;
            double height = y2 - y1;
            if (height <= 0) continue;

            double width = unionX(active);
            double slabArea = width * height;

            if (currArea + slabArea >= half) {
                return y1 + (half - currArea) / width;
            }
            currArea += slabArea;
        }

        return events.get(events.size() - 1).y;
    }

    private void update(List<double[]> active, Event e) {
        if (e.type == 1) {
            active.add(new double[]{e.x1, e.x2});
        } else {
            for (int i = 0; i < active.size(); i++) {
                if (active.get(i)[0] == e.x1 && active.get(i)[1] == e.x2) {
                    active.remove(i);
                    break;
                }
            }
        }
    }

    private double unionX(List<double[]> intervals) {
        if (intervals.isEmpty()) return 0.0;

        intervals.sort(Comparator.comparingDouble(a -> a[0]));
        double len = 0.0;
        double start = intervals.get(0)[0];
        double end = intervals.get(0)[1];

        for (int i = 1; i < intervals.size(); i++) {
            double[] in = intervals.get(i);
            if (in[0] > end) {
                len += end - start;
                start = in[0];
                end = in[1];
            } else {
                end = Math.max(end, in[1]);
            }
        }
        return len + (end - start);
    }
}
