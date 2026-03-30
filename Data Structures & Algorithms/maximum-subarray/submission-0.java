class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);  // either start fresh from current or extend previous
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}
