class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<=j) {
            int mid=i+(j-i)/2;
            if(nums[mid]==target) {
                return true;
            }
            if(nums[mid]>target) {
                j=mid-1;
            } else {
                i=mid+1;
            }
        }
        return false;
    }
}