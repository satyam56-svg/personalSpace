class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        
        // Step 1: Add FIRST array (smaller one preferred)
        for(int num : nums1) {
            set.add(num);
        }
        
        // Step 2: Check SECOND array elements in set
        for(int num : nums2) {
            if(set.contains(num)) {
                res.add(num);  // Auto-deduplicates
            }
        }
        
        // Step 3: Convert to int[] (CRITICAL)
        int[] result = new int[res.size()];
        int idx = 0;
        for(int num : res) {
            result[idx++] = num;  // Unbox Integer to int
        }
        return result;
    }
}
