class Solution {

    public int max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = max(piles);
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid; // same as ceil(pile/(double)mid)
            }

            if (hours <= h) {
                answer = mid; // Try to minimize K
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
