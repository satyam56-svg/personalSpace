class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int[] result = new int[n1];
        for (int i = 0; i < n1; i++) {
            int target = nums1[i];
            boolean found = false;
            result[i] = -1;
            for (int num : nums2) {
                if (found && num > target) {
                    result[i] = num;
                    break;
                }
                if (target == num) {
                    found = true;
                }
            }
        }
        return result;
    }
}
