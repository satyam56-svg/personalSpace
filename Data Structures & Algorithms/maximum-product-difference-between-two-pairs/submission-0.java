class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int first=nums[0];
        int second=nums[1];
        int last=nums[n-1];
        int secondLast=nums[n-2];

        return last*secondLast-first*second;
    }
}