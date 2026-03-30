class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int output[]=new int[n];
        int k=0;

        for(int i=0; i<n; i++) {
            if(nums[i]%2==0) {
                output[k++]=nums[i];
            }
        }

        for(int i=0; i<n; i++) {
            if(nums[i]%2!=0) {
                output[k++]=nums[i];
            }
        }

        return output;
    }
}