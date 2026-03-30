class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int result[]=new int[n];
        int max=-1;
        for(int i=n-2; i>=0; i--) {
            if(arr[i+1]>max) {
                max=arr[i+1];
                result[i]=max;
            } else {
                result[i]=Math.max(arr[i+1],max);
            }
        }
        result[n-1]=-1;
        return result;
    }
}