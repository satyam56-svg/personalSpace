class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        helper(nums,0,n-1);
        helper(nums,0,k-1);
        helper(nums,k,n-1);
    }

    public void helper(int arr[], int a, int b) {
        while(a<b) {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}