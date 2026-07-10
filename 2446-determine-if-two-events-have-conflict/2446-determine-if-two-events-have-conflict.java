class Solution {
    public int parseTime(String time) {
        String[] parts = time.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour * 60 + minute;
    }
    public boolean haveConflict(String[] event1, String[] event2) {
        int[] e1 = {
            parseTime(event1[0]),
            parseTime(event1[1])
        };

        int[] e2 = {
            parseTime(event2[0]),
            parseTime(event2[1])
        };

       
        return Math.max(e1[0], e2[0]) <= Math.min(e1[1], e2[1]);


        
    }
}