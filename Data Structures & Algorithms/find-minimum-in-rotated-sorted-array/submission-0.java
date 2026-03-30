class Solution {
    public int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                // Minimum is in right part
                low = mid + 1;
            } else {
                // Minimum is in left part including mid
                high = mid;
            }
        }
        // After loop, low == high and pointing to minimum
        return arr[low];
    }
}
