class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();  // stack will store indices

        for (int i = n - 1; i >= 0; i--) {
            // Pop indices where temperature is <= current
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = 0; // no warmer day found
            } else {
                res[i] = st.peek() - i; // index difference = days to warmer temperature
            }
            st.push(i); // push current day's index
        }
        return res;
    }
}
