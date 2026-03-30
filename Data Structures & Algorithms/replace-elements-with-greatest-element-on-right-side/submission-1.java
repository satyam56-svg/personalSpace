class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int max = -1;
        
        // Right to left traversal
        for(int i = n-2; i >= 0; i--) {
            max = Math.max(max, arr[i+1]);  // Update max with right element
            result[i] = max;
        }
        result[n-1] = -1;  // Last element always -1
        return result;
    }
}
