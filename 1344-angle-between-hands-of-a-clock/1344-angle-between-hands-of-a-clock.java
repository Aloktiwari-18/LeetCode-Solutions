class Solution {
    public double angleClock(int h, int m) {
        double ans1= Math.abs(60*h-11*m)/2.0;
        double ans2= 360-ans1;
        return Math.min(ans1, ans2);
    }
}