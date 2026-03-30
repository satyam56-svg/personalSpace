// import java.util.*;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        int size = q.size();
        // rotate the queue so that the new element is at the front
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove(); // removes the front element (top of stack)
    }

    public int top() {
        return q.peek(); // front element is the top
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
