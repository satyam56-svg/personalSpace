// import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int partner = target - nums[i];

            if (map.containsKey(partner)) {
                res[0] = map.get(partner);
                res[1] = i;
                return res;
            }

            map.put(nums[i], i); // current value and its index
        }

        return res; // if no solution found
    }
}
