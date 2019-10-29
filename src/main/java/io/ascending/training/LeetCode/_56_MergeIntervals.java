package io.ascending.training.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= end ) {
                end = Math.max(intervals[i][1], end);
            } else {
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][2]);
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};

        _56_MergeIntervals tmp = new _56_MergeIntervals();

        System.out.print(tmp.merge(input));

    }
}
