class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int[] dpMax = new int[n];
        int[] dpMin = new int[n];

        dpMax[0] = nums[0];
        dpMin[0] = nums[0];

        int result = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];

            dpMax[i] = Math.max(curr, Math.max(curr * dpMax[i - 1], curr * dpMin[i - 1]));
            dpMin[i] = Math.min(curr, Math.min(curr * dpMax[i - 1], curr * dpMin[i - 1]));

            result = Math.max(result, dpMax[i]);
        }

        return result;
    }
}
