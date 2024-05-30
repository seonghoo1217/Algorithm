package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        _56 v = new _56();
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = v.merge(arr);
        for (int[] m : merge) {
            System.out.println("start:" + m[0]);
            System.out.println("end:" + m[1]);
        }
    }
}
