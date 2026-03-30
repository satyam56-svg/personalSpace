class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;  // Calculate total sum [web:1]
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;  // Found pivot where left == right [web:2]
            }
            leftSum += nums[i];  // Update left sum incrementally [web:3]
        }
        return -1;  // No pivot found
    }
}
