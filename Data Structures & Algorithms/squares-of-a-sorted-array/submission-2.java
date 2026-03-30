class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }
    
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Square all elements first
        for(int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        
        // TWO POINTERS - Fill result BACKWARDS
        int left = 0, right = n-1;
        int k = n-1;  // Fill from end
        
        while(left <= right) {
            if(nums[left] <= nums[right]) {
                result[k--] = nums[right--];  // Right larger
            } else {
                result[k--] = nums[left++];   // Left larger
            }
        }
        return result;
    }
}
