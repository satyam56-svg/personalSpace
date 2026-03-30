class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        int original[]=new int[heights.length];

        for(int i=0; i<heights.length; i++) {
            original[i]=heights[i];
        }

        Arrays.sort(heights);

        for(int i=0; i<heights.length; i++) {
            expected[i]=heights[i];
        }

        int count=0;
        for(int i=0; i<heights.length; i++) {
            if(original[i]!=expected[i]) {
                count++;
            }
        }

        return count;
    }
}