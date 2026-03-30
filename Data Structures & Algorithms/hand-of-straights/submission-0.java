// import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // If total cards can't be divided evenly into groups
        if (hand.length % groupSize != 0) return false;

        Arrays.sort(hand); // sort the hand
        Map<Integer, Integer> freq = new HashMap<>();
        for (int card : hand) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        // Try to form groups starting from the smallest card
        for (int card : hand) {
            if (freq.get(card) == 0) continue; // already used

            // Attempt to build a group of size groupSize
            for (int i = 0; i < groupSize; i++) {
                int curr = card + i;
                if (freq.getOrDefault(curr, 0) == 0) {
                    return false; // can't form group
                }
                freq.put(curr, freq.get(curr) - 1); // use one card
            }
        }
        return true;
    }
}