// import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int removals = 0;
        int prevEnd = intervals[0][1];

        // Step 2: iterate through intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                // Overlap → remove one interval
                removals++;
                prevEnd = Math.min(prevEnd, intervals[i][1]); 
            } else {
                // No overlap → just move forward
                prevEnd = intervals[i][1];
            }
        }

        return removals;
    }
}
