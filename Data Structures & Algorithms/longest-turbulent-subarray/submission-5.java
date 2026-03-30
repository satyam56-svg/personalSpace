class Solution {
    public int maxTurbulenceSize(int[] arr) {

        int n = arr.length;
        if (n == 1) return 1;

        int max = 1;
        int curr = 1;

        boolean lastUp = false;
        boolean lastDown = false;

        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i - 1]) {

                if (lastUp) {
                    curr = 2;      // same direction → restart
                } else {
                    curr++;        // alternate → extend
                }

                lastUp = true;
                lastDown = false;

            } 
            else if (arr[i] < arr[i - 1]) {

                if (lastDown) {
                    curr = 2;
                } else {
                    curr++;
                }

                lastDown = true;
                lastUp = false;

            } 
            else {   // equal

                curr = 1;
                lastUp = false;
                lastDown = false;
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}
