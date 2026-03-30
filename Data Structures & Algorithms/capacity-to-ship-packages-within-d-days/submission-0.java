class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int low = 0;
        int high = 0;

        // find max and sum
        for (int i = 0; i < n; i++) {
            if (weights[i] > low) {
                low = weights[i];   // max element
            }
            high += weights[i];     // total sum
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(weights, n, days, mid)) {
                ans = mid;
                high = mid - 1;   // try smaller capacity
            } else {
                low = mid + 1;    // increase capacity
            }
        }

        return ans;
    }

    public boolean isPossible(int[] weights, int n, int days, int capacity) {
        int daysUsed = 1;
        int currentLoad = 0;

        for (int i = 0; i < n; i++) {
            if (currentLoad + weights[i] <= capacity) {
                currentLoad += weights[i];
            } else {
                daysUsed++;
                currentLoad = weights[i];
            }
        }

        return daysUsed <= days;
    }
}