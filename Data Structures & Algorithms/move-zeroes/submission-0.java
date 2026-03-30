class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        int k=0;
        int output[]=new int[n];
        for(int i=0; i<n; i++) {
            if(nums[i]==0) {
                count++;
            } else {
                output[k++]=nums[i];
            }
        }

        for(int j=0; j<count; j++) {
            output[k++]=0;
        }

        for(int i=0; i<n; i++) {
            nums[i]=output[i];
        }
    }
}