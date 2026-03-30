class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=findInc(nums);
        int dec=findDec(nums);

        return Math.max(inc,dec);
    }

    public int findInc(int arr[]) {
        int left=0;
        int maxLen=1;

        for(int right=1; right<arr.length; right++) {
            if(arr[right]>arr[right-1]) {
                maxLen=Math.max(maxLen,right-left+1);
            } else {
                left=right;
            }
        }

        return maxLen;
    }

    public int findDec(int arr[]) {
        int left=0;
        int maxLen=1;

        for(int right=1; right<arr.length; right++) {
            if(arr[right]<arr[right-1]) {
                maxLen=Math.max(maxLen,right-left+1);
            } else {
                left=right;
            }
        }

        return maxLen;
    }
}