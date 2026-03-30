// import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top); // push back the popped one
                st.push(newScore);
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
            } else if (op.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(op)); // convert string to int
            }
        }

        int sum = 0;
        for (int score : st) {
            sum += score;
        }

        return sum;
    }
}
