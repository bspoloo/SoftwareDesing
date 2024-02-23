package bspo.SoftwareDesing.Exercise2;

import java.util.List;

public class ParseInterval {
    public static Interval parse(int[] start) {
        return new Interval(start[0], start[1]);
    }

    public static List<Interval> parse(int[][] start) {
        List<Interval> intervals = new java.util.ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            intervals.add(parse(start[i]));
        }
        return intervals;
    }

}
