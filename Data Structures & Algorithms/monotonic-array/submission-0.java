class Solution {
    public boolean isMonotonic(int[] nums) {

        if(nums.length==1) return true;

        int first=nums[0];
        int second=nums[1];

        if(first>second) {
            for(int i=0; i<nums.length-1; i++) {
                if(nums[i]<nums[i+1]) return false;
            }
        } else {
            for(int i=0; i<nums.length-1; i++) {
                if(nums[i]>nums[i+1]) return false;
            }
        }

        return true;

    }
}