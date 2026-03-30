class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int count=0;

        // for (int i = 0; i < n; i++) {
        //     int currSum = 0;
        //     for (int j = i; j < n; j++) {
        //         currSum += nums[j];
        //         if (currSum == k) {
        //             count++;
        //         }
        //     }
        // }

        // return count;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum 0 ek baar hua hai

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check karo ki prefixSum - k pehle aaya tha kya
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store current prefix sum in map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}