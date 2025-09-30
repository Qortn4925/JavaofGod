package algoritm.leetcode.grind1;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];

            // newInterval이 현재 interval보다 왼쪽에 있을 경우
            if (newInterval[1] < interval[0]) {
                result.add(newInterval);
                // 나머지 intervals 전부 추가
                while (i < intervals.length) {
                    result.add(intervals[i++]);
                }
                return result.toArray(new int[result.size()][]);
            }
            // newInterval이 현재 interval보다 오른쪽에 있을 경우
            else if (newInterval[0] > interval[1]) {
                result.add(interval);
            }
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
