// import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()]; // nikali hui bar ki height
                int width = stack.isEmpty() ? i : i - stack.peek() - 1; // width nikalna
                maxArea = Math.max(maxArea, height * width); // area calculate
            }

            stack.push(i);
        }

        return maxArea;
    }
}