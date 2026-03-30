// import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder()); // max heap

        // insert all stones
        for(int s : stones)
            pq.add(s);

        while(pq.size() > 1) {
            int a = pq.poll(); // largest
            int b = pq.poll(); // second largest

            if(a != b)
                pq.add(a - b);
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
