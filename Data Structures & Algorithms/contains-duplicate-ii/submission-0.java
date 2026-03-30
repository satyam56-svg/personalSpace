// import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If duplicate found within window
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current element to set
            set.add(nums[i]);

            // Keep window size ≤ k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}
