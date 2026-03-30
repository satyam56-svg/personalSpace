class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr=nums[0];
        int max=nums[0];
        int n=nums.length;

        for(int i=1; i<n; i++) {
            if(nums[i]>nums[i-1]) {
                curr+=nums[i];
            } else {
                max=Math.max(max,curr);
                curr=nums[i];
            }
        }
        max=Math.max(max,curr);

        return max;
    }
}