class Solution {
    public int maxArea(int[] arr) {
        int i=0,j=arr.length-1;
        int maxArea=0;
        while(i<j) {
            int currArea=(j-i)*Math.min(arr[i],arr[j]);
            if(arr[i]<arr[j]) i++;
            else j--;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}
