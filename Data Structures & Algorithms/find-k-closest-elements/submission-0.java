// import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        LinkedList<Integer> list = new LinkedList<>();
        
        // Add all elements to LinkedList
        for (int num : arr) {
            list.add(num);
        }
        
        // Remove elements until size becomes k
        while (list.size() > k) {
            if (Math.abs(list.getFirst() - x) > Math.abs(list.getLast() - x)) {
                list.removeFirst(); // remove from left
            } else {
                list.removeLast();  // remove from right
            }
        }
        
        return list;
    }
}
